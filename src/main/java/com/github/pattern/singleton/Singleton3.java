package com.github.pattern.singleton;

/**
 * 单例模式3-（懒汉式，线程不安全）
 *
 * @author echils
 * @since 2020-01-05 21:31:01
 */
public class Singleton3 {

    private static Singleton3 instance;

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        //线程不安全
        if (instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton3 a = Singleton3.getInstance();
        Singleton3 b = Singleton3.getInstance();
        System.out.println(a == b);
    }
}
