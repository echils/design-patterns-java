package com.github.pattern.decorator;

/**
 * 苹果手机
 *
 * @author echils
 */
public class HuaWeiPhone implements Phone {
    @Override
    public void show() {
        System.out.println("华为手机");
    }
}
