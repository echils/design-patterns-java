package com.github.pattern.factory.abs;

import com.github.pattern.factory.IBasketball;
import com.github.pattern.factory.SpaldingBasketball;

/**
 * 威尔胜工厂
 *
 * @author echils
 */
public class WilsonFactory implements IFactory {

    @Override
    public IBasketball createBasketball(String name) {
        IBasketball basketball = null;
        if ("威尔胜".equals(name)) {
            basketball = new SpaldingBasketball();
        }
        return basketball;
    }

    @Override
    public IWristband createWristbands(String name) {
        IWristband wristbands = null;
        if ("威尔胜".equals(name)) {
            wristbands = new WilsonWristband();
        }
        return wristbands;
    }

}
