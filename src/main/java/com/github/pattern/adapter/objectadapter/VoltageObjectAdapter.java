package com.github.pattern.adapter.objectadapter;

import com.github.pattern.adapter.classadapter.CommercialVoltage;
import com.github.pattern.adapter.classadapter.HouseholdVoltage;

/**
 * 对象适配
 *
 * @author echils
 */
public class VoltageObjectAdapter implements HouseholdVoltage {

    CommercialVoltage voltage = new CommercialVoltage();

    @Override
    public int output220V() {
        return voltage.output330V() - 110;
    }

}
