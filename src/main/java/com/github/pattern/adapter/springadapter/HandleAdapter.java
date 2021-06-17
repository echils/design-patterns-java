package com.github.pattern.adapter.springadapter;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * 适配器
 *
 * @author echils
 * @since 2019-06-17 11:35:11
 */
public class HandleAdapter {

    public static List<Class<?>> getAllAssignedClass(Class<?> cls) throws Exception {
        List<Class<?>> classes = new ArrayList();
        for (Class<?> c : getClasses(cls)) {
            if (cls.isAssignableFrom(c) && !cls.equals(c)) {
                classes.add(c);
            }
        }
        return classes;
    }

    public static List<Class<?>> getClasses(Class<?> cls) throws Exception {
        //当前包下的实现类
        String pk = cls.getPackage().getName();
        String path = pk.replace('.', '/');
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        URL url = classloader.getResource(path);
        return getClasses(new File(url.getFile()), pk);
    }

    //根据路径获取
    public static List<Class<?>> getClasses(File dir, String pk) throws ClassNotFoundException {
        List<Class<?>> classes = new ArrayList();
        if (!dir.exists()) {
            return classes;
        }
        for (File f : dir.listFiles()) {
            if (f.isDirectory()) {
                classes.addAll(getClasses(f, pk + "." + f.getName()));
            }
            String name = f.getName();
            if (name.endsWith(".class")) {
                classes.add(Class.forName(pk + "." + name.substring(0, name.length() - 6)));
            }
        }
        return classes;
    }

    /**
     * 获取项目中所有的实现类
     *
     * @param clazz
     * @return
     */
    public static List<Class<?>> getAllClassByInterface(Class clazz) {
        ArrayList<Class<?>> list = new ArrayList<>();
        // 判断是否是一个接口
        if (clazz.isInterface()) {
            try {
                ArrayList<Class> allClass = getAllClass(clazz.getPackage().getName());
                /**
                 * 循环判断路径下的所有类是否实现了指定的接口 并且排除接口类自己
                 */
                for (int i = 0; i < allClass.size(); i++) {
                    /**
                     * 判断是不是同一个接口
                     */
                    // isAssignableFrom:判定此 Class 对象所表示的类或接口与指定的 Class
                    // 参数所表示的类或接口是否相同，或是否是其超类或超接口
                    if (clazz.isAssignableFrom(allClass.get(i))) {
                        if (!clazz.equals(allClass.get(i))) {
                            // 自身并不加进去
                            list.add(allClass.get(i));
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException("出现异常" + e.getMessage());
            }
        }
        return list;
    }

    /**
     * 从一个指定路径下查找所有的类
     *
     * @param packageName
     */
    private static ArrayList<Class> getAllClass(String packageName) {

        List<String> classNameList = getClassName(packageName);
        ArrayList<Class> list = new ArrayList<>();
        for (String className : classNameList) {
            try {
                list.add(Class.forName(className));
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("load class from name failed:" + className + e.getMessage());
            }
        }
        return list;
    }

    /**
     * 获取某包下所有类
     *
     * @param packageName 包名
     * @return 类的完整名称
     */
    public static List<String> getClassName(String packageName) {

        List<String> fileNames = null;
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        String packagePath = packageName.replace(".", "/");
        URL url = loader.getResource(packagePath);
        if (url != null) {
            String type = url.getProtocol();
            if (type.equals("file")) {
                String fileSearchPath = url.getPath();
                fileSearchPath = fileSearchPath.substring(0, fileSearchPath.indexOf("/classes"));
                fileNames = getClassNameByFile(fileSearchPath);
            } else {
                throw new RuntimeException("file system not support! cannot load MsgProcessor！");
            }
        }
        return fileNames;
    }

    /**
     * 从项目文件获取某包下所有类
     *
     * @param filePath 文件路径
     * @return 类的完整名称
     */
    private static List<String> getClassNameByFile(String filePath) {
        List<String> myClassName = new ArrayList();
        File file = new File(filePath);
        File[] childFiles = file.listFiles();
        for (File childFile : childFiles) {
            if (childFile.isDirectory()) {
                myClassName.addAll(getClassNameByFile(childFile.getPath()));
            } else {
                String childFilePath = childFile.getPath();
                if (isWin()) {
                    childFilePath = childFilePath.replaceAll("\\\\", "/");
                }
                if (childFilePath.endsWith(".class")) {
                    childFilePath = childFilePath.substring(childFilePath.indexOf("/classes") + 9, childFilePath.lastIndexOf(".class"));
                    childFilePath = childFilePath.replace("/", ".");
                    myClassName.add(childFilePath);
                }
            }
        }
        return myClassName;
    }

    private static boolean isWin() {
        String operation = System.getProperty("os.name");
        return operation.contains("Windows") || operation.contains("windows");
    }

    public Handle adapter(String kind) {
        //获取Handle所有实现类
        List<Class<?>> children = null;
        try {
            //方式一
//            children = getAllAssignedClass(Handle.class);
            //方式二
            children = getAllClassByInterface(Handle.class);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (children != null && children.size() != 0) {
            for (Class<?> clazz : children) {
                Handle handle = null;
                try {
                    handle = (Handle) clazz.newInstance();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (handle != null && handle.support().equals(kind)) {
                    return handle;
                }
            }
        }
        return null;
    }
}
