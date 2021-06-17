package com.github.pattern.factory.abs;

/**
 * 斯伯丁护腕
 *
 * @author echils
 * @since 2020-01-02 21:39:47
 */
public class SpaldingWristband implements IWristband {

    @Override
    public void value() {
        System.out.println("斯伯丁护腕");
    }
}
