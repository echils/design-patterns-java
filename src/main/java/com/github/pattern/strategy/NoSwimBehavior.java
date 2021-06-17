package com.github.pattern.strategy;

/**
 * NoSwimBehavior
 *
 * @author echils
 * @since 2020-01-18 14:39:30
 */
public class NoSwimBehavior implements ISwimBehavior {
    @Override
    public void swim() {
        System.out.println("不会游泳");
    }
}
