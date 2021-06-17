package com.github.pattern.factory.abs;

/**
 * 威尔胜护腕
 *
 * @author echils
 * @since 2020-01-02 21:39:47
 */
public class WilsonWristband implements IWristband {

    @Override
    public void value() {
        System.out.println("威尔胜护腕");
    }
}
