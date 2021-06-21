package com.github.pattern.strategy;

/**
 * NoFlyBehavior
 *
 * @author echils
 */
public class NoFlyBehavior implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("不会飞行");
    }
}
