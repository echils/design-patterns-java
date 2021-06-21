package com.github.pattern.factory.abs;

/**
 * 斯伯丁护腕
 *
 * @author echils
 */
public class SpaldingWristband implements IWristband {

    @Override
    public void value() {
        System.out.println("斯伯丁护腕");
    }
}
