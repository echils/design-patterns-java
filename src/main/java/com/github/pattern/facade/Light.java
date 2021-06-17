package com.github.pattern.facade;

/**
 * 灯
 *
 * @author echils
 * @since 2020-01-02 20:02:15
 */
public class Light {

    private static Light light = new Light();

    private Light() {
    }

    public static Light getInstance() {
        return light;
    }

    public void open() {
        System.out.println("开灯");
    }

    public void close() {
        System.out.println("关灯");
    }
}
