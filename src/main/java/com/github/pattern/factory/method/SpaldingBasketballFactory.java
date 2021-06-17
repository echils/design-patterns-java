package com.github.pattern.factory.method;

import com.github.pattern.factory.IBasketball;
import com.github.pattern.factory.SpaldingBasketball;

/**
 * 斯伯丁工厂
 *
 * @author echils
 * @since 2020-01-02 21:39:47
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
