package com.github.pattern.strategy;

/**
 * SwimFastBehavior
 *
 * @author echils
 * @since 2020-01-18 14:39:30
 */
public class SwimFastBehavior implements ISwimBehavior {
    @Override
    public void swim() {
        System.out.println("快速游泳");
    }
}
