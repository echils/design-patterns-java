package com.github.pattern.strategy;

/**
 * FlyHighBehavior
 *
 * @author echils
 * @since 2020-01-18 14:37:15
 */
public class FlyLowBehavior implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("低空飞行");
    }
}
