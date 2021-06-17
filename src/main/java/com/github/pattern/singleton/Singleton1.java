package com.github.pattern.singleton;

public class Singleton1 {

    //提供私有的唯一实例
    private static final Singleton1 instance = new Singleton1();

    //第一步私有化构造器
    private Singleton1() {
    }

    //提供公共的获取实例的方法
    public static Singleton1 getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        Singleton1 a = Singleton1.getInstance();
        Singleton1 b = Singleton1.getInstance();

        System.out.println(a == b);
    }
}
