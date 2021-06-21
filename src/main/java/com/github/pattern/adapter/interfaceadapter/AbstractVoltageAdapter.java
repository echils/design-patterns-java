package com.github.pattern.adapter.interfaceadapter;

/**
 * 实现所有接接口，但是是空实现，留给使用时重写
 *
 * @author echils
 */
public abstract class AbstractVoltageAdapter implements VoltageAll {

    @Override
    public int output220V() {
        return 0;
    }

    @Override
    public int output330V() {
        return 0;
    }

    @Override
    public int output36V() {
        return 0;
    }
}
