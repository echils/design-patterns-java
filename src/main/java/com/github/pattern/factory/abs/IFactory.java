package com.github.pattern.factory.abs;

import com.github.pattern.factory.IBasketball;

/**
 * 抽象工厂
 *
 * @author echils
 * @since 2020-01-02 21:39:47
 */
public interface IFactory {

    /**
     * 篮球
     *
     * @param name
     * @return
     */
    IBasketball createBasketball(String name);

    /**
     * 护腕
     *
     * @param name
     * @return
     */
    IWristband createWristbands(String name);


}
