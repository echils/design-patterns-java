package com.github.pattern.singleton;

/**
 * 单例模式7-（静态内部类，线程安全）
 *
 * @author echils
 * @since 2020-01-05 21:31:01
 */
public class Singleton7 {

    private Singleton7() {
    }

    public static Singleton7 getInstance() {
        return Singleton7Inner.INSTANCE;
    }

    public static void main(String[] args) {
        Singleton7 a = Singleton7.getInstance();
        Singleton7 b = Singleton7.getInstance();
        System.out.println(a == b);
    }

    private static class Singleton7Inner {
        //内部静态类的加载是懒加载机制
        private static final Singleton7 INSTANCE = new Singleton7();
    }
}
