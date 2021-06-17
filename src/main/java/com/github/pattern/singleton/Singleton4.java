package com.github.pattern.singleton;

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
