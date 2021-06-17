package com.github.pattern.singleton;

enum SingletonEnum {
    INSTANCE
}

public class Singleton8 {
    public static void main(String[] args) {

        SingletonEnum a = SingletonEnum.INSTANCE;
        SingletonEnum b = SingletonEnum.INSTANCE;
        System.out.println(a == b);
    }
}
