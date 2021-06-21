package com.github.pattern.adapter.classadapter;

/**
 * 电压适配器
 *
 * @author echils
 */
public class VoltageClassAdapter extends CommercialVoltage implements HouseholdVoltage {

    @Override
    public int output220V() {
        return super.output330V() - 110;
    }

}
