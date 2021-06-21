package com.github.pattern.decorator;

/**
 * 苹果手机
 *
 * @author echils
 */
public class ApplePhone implements Phone {
    @Override
    public void show() {
        System.out.println("苹果手机");
    }
}
