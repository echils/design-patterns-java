package com.github.pattern.singleton;

/**
 * 单例模式5-（懒汉式，线程不安全，同步代码块）
 *
 * @author echils
 */
public class Singleton5 {

    private static Singleton5 instance;

    private Singleton5() {
    }

    public static Singleton5 getInstance() {
        if (instance == null) {
            //同样的线程不安全
            synchronized (Singleton5.class) {
                instance = new Singleton5();
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton5 a = Singleton5.getInstance();
        Singleton5 b = Singleton5.getInstance();
        System.out.println(b == a);
    }
}
