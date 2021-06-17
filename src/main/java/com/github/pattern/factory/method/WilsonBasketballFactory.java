package com.github.pattern.factory.method;

import com.github.pattern.factory.IBasketball;
import com.github.pattern.factory.SpaldingBasketball;

/**
 * 威尔胜工厂
 *
 * @author echils
 * @since 2020-01-02 21:39:47
 */
public class WilsonBasketballFactory extends AbstractBasketballFactory {

    @Override
    IBasketball createBasketball(String name) {
        IBasketball basketball = null;
        if ("威尔胜".equals(name)) {
            basketball = new SpaldingBasketball();
        }
        return basketball;
    }
}
