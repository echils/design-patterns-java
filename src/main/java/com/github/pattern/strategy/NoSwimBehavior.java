package com.github.pattern.strategy;

/**
 * NoSwimBehavior
 *
 * @author echils
 */
public class NoSwimBehavior implements ISwimBehavior {
    @Override
    public void swim() {
        System.out.println("不会游泳");
    }
}
