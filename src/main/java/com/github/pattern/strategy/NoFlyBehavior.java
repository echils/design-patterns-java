package com.github.pattern.strategy;

/**
 * NoFlyBehavior
 *
 * @author echils
 * @since 2020-01-18 14:37:15
 */
public class NoFlyBehavior implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("不会飞行");
    }
}
