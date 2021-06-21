package com.github.pattern.proxy.cglib;

/**
 * Dog
 *
 * @author echils
 */
public class Dog {

    private String name;

    //必须包好无参构造器
    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    //测试静态方法将不会进行代理
    public static void sleep() {
        System.out.println("狗狗睡觉");
    }

    public void free() {
        System.out.println("遛狗");
    }
}
