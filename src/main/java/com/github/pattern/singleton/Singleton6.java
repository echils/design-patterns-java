package com.github.pattern.singleton;

public class Singleton6 {

    // 使变量更改后迅速更改到缓存
    private static volatile Singleton6 instance;

    private Singleton6() {
    }

    public static Singleton6 getInstance() {
        if (instance == null) {
            //第一步校验
            synchronized (Singleton6.class) {
                //双重校验
                if (instance == null) {
                    instance = new Singleton6();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton6 a = Singleton6.getInstance();
        Singleton6 b = Singleton6.getInstance();
        System.out.println(b == a);
    }
}
