package com.github.pattern.factory.method;

import com.github.pattern.factory.IBasketball;

/**
 * 工厂方法模式
 *
 * @author echils
 * @since 2020-01-02 21:39:47
 */
public abstract class AbstractBasketballFactory {

    abstract IBasketball createBasketball(String name);
}
