package com.github.pattern.strategy;

/**
 * FlyHighBehavior
 *
 * @author echils
 */
public class FlyHighBehavior implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("高空飞行");
    }
}
