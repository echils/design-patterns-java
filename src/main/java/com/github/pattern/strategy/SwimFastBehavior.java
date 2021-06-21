package com.github.pattern.strategy;

/**
 * SwimFastBehavior
 *
 * @author echils
 */
public class SwimFastBehavior implements ISwimBehavior {
    @Override
    public void swim() {
        System.out.println("快速游泳");
    }
}
