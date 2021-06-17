package com.github.pattern.strategy;

/**
 * FlyHighBehavior
 *
 * @author echils
 * @since 2020-01-18 14:37:15
 */
public class FlyHighBehavior implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("高空飞行");
    }
}
