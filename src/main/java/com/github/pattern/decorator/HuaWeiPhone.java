package com.github.pattern.decorator;

/**
 * 苹果手机
 *
 * @author echils
 * @since 2020-01-01 23:14:46
 */
public class HuaWeiPhone implements Phone {
    @Override
    public void show() {
        System.out.println("华为手机");
    }
}
