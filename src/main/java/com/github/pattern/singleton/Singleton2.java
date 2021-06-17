package com.github.pattern.singleton;

public class Singleton2 {

    private static Singleton2 instance;

    static {
        instance = new Singleton2();
    }

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        Singleton2 a = Singleton2.getInstance();
        Singleton2 b = Singleton2.getInstance();

        System.out.println(a == b);
    }

}
