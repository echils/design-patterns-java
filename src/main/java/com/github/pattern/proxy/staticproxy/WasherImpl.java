package com.github.pattern.proxy.staticproxy;

/**
 * WasherImpl
 *
 * @author echils
 * @since 2020-01-05 22:30:02
 */
public class WasherImpl implements IWasher {
    @Override
    public void wash() {
        System.out.println("洗衣服");
    }
}
