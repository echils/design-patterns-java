package com.github.pattern.singleton;

//通过静态内部类来实现单例模式
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
