package com.github.pattern.factory.method;

import com.github.pattern.factory.IBasketball;
import com.github.pattern.factory.SpaldingBasketball;

/**
 * 斯伯丁工厂
 *
 * @author echils
 */
public class SpaldingBasketballFactory extends AbstractBasketballFactory {

    public IBasketball createBasketball(String name) {
        IBasketball basketball = null;
        if ("斯伯丁".equals(name)) {
            basketball = new SpaldingBasketball();
        }
        return basketball;
    }

}
