package com.github.pattern.singleton;

/**
 * 单例模式4-（懒汉式，线程安全，同步方法）
 *
 * @author echils
 * @since 2020-01-05 21:31:01
 */
public class Singleton4 {

    private static Singleton4 instance;

    private Singleton4() {
    }

    public static synchronized Singleton4 getInstance() {
        //线程安全
        if (instance == null) {
            instance = new Singleton4();
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton4 a = Singleton4.getInstance();
        Singleton4 b = Singleton4.getInstance();
        System.out.println(a == b);
    }
}
