package com.github.pattern.factory.simple;

import com.github.pattern.factory.IBasketball;
import com.github.pattern.factory.SpaldingBasketball;
import com.github.pattern.factory.WilsonBasketball;

/**
 * 简单工厂模式
 *
 * @author echils
 */
public class BasketballSimpleFactory {

    public static IBasketball createBasketball(String name) {
        IBasketball basketball = null;
        if (name.equals("斯伯丁")) {
            basketball = new SpaldingBasketball();
        } else if (name.equals("威尔胜")) {
            basketball = new WilsonBasketball();
        }
        return basketball;
    }
}
