package com.github.pattern.factory.abs;

import com.github.pattern.factory.IBasketball;

/**
 * 抽象工厂
 *
 * @author echils
 */
public interface IFactory {

    /**
     * 篮球
     *
     * @param name
     */
    IBasketball createBasketball(String name);

    /**
     * 护腕
     *
     * @param name
     */
    IWristband createWristbands(String name);


}
