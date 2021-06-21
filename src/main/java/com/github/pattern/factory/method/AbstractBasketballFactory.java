package com.github.pattern.factory.method;

import com.github.pattern.factory.IBasketball;

/**
 * 工厂方法模式
 *
 * @author echils
 */
public abstract class AbstractBasketballFactory {

    abstract IBasketball createBasketball(String name);

}
