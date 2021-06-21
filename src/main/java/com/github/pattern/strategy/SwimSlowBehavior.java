package com.github.pattern.strategy;

/**
 * SwimSlowBehavior
 *
 * @author echils
 */
public class SwimSlowBehavior implements ISwimBehavior {
    @Override
    public void swim() {
        System.out.println("低速游泳");
    }
}
