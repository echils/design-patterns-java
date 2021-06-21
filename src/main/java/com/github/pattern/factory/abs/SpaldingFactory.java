package com.github.pattern.factory.abs;

import com.github.pattern.factory.IBasketball;
import com.github.pattern.factory.SpaldingBasketball;

/**
 * 斯伯丁工厂
 *
 * @author echils
 */
public class SpaldingFactory implements IFactory {

    public IBasketball createBasketball(String name) {
        IBasketball basketball = null;
        if ("斯伯丁".equals(name)) {
            basketball = new SpaldingBasketball();
        }
        return basketball;
    }

    @Override
    public IWristband createWristbands(String name) {
        IWristband wristbands = null;
        if ("斯伯丁".equals(name)) {
            wristbands = new SpaldingWristband();
        }
        return wristbands;
    }

}
