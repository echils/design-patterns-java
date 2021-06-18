package com.github.pattern.singleton;

/**
 * 单例模式8-（枚举类，线程安全，不仅能避免多线程同步的问题，而且还能防止反序列化重新创建新的对象）
 * 由于Java反序列化会重新创建新对象，则会破坏单例。如果必要，那么只能选择方式8来创建单例
 *
 * @author echils
 * @since 2020-01-05 21:31:01
 */
public class Singleton8 {

    public static void main(String[] args) {
        SingletonEnum a = SingletonEnum.INSTANCE;
        SingletonEnum b = SingletonEnum.INSTANCE;
        System.out.println(a == b);
    }
}

enum SingletonEnum {
    INSTANCE
}