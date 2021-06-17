package com.github.pattern.strategy;

/**
 * SwimSlowBehavior
 *
 * @author echils
 * @since 2020-01-18 14:39:30
 */
public class SwimSlowBehavior implements ISwimBehavior {
    @Override
    public void swim() {
        System.out.println("低速游泳");
    }
}
