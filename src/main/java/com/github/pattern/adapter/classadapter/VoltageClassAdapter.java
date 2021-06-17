package com.github.pattern.adapter.classadapter;

/**
 * 电压适配器
 *
 * @author echils
 * @since 2019-06-17 10:48:40
 */
public class VoltageClassAdapter extends CommercialVoltage implements HouseholdVoltage {

    @Override
    public int output220V() {
        return super.output330V() - 110;
    }

}
