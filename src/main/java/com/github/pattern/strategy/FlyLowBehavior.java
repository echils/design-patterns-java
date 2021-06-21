package com.github.pattern.strategy;

/**
 * FlyLowBehavior
 *
 * @author echils
 */
public class FlyLowBehavior implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("低空飞行");
    }
}
