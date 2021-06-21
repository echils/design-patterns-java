package com.github.pattern.proxy.staticproxy;

/**
 * WasherImpl
 *
 * @author echils
 */
public class WasherImpl implements IWasher {
    @Override
    public void wash() {
        System.out.println("洗衣服");
    }
}
