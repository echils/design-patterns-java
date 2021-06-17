package com.github.pattern.adapter;

import com.github.pattern.adapter.classadapter.VoltageClassAdapter;
import com.github.pattern.adapter.interfaceadapter.AbstractVoltageAdapter;
import com.github.pattern.adapter.springadapter.Handle;
import com.github.pattern.adapter.springadapter.HandleAdapter;
import org.junit.jupiter.api.Test;

/**
 * 适配器模式测试类
 *
 * @author echils
 * @since 2019-06-17 11:52:11
 */
public class AdapterTest {

    /*
        类适配器
        缺点：Java只能单继承，所以适配其他类型时只能选择选择实现接口的方式
    */
    @Test
    public void testClassAdapter() {
        VoltageClassAdapter voltageClassAdapter = new VoltageClassAdapter();
        System.out.println(voltageClassAdapter.output220V());
        System.out.println(voltageClassAdapter.output330V());
    }


    /*
     对象适配器
     优点：解决上面的问题，适配其他类型时选择的方式更多
     缺点：通过了聚合的方式增加了耦合度
    */
    @Test
    public void testObjectAdapter() {
        VoltageClassAdapter voltageClassAdapter = new VoltageClassAdapter();
        System.out.println(voltageClassAdapter.output220V());
        System.out.println(voltageClassAdapter.output330V());
    }

    /*
     接口适配器
     适用于一个接口不想适用其所有方法的情况
     当不需要全部实现接口提供的方法时，可先设计一个抽象类实现接口，并为该接口中每个方法提供一个默认实现（空方法），
     那么该抽象类的子类可有选择的覆盖父类的某些放啊来实现需求
    */
    @Test
    public void testInterfaceAdapter() {
        System.out.println(new AbstractVoltageAdapter() {
            @Override
            public int output220V() {
                return 220;
            }
        });
        System.out.println(new AbstractVoltageAdapter() {
            @Override
            public int output220V() {
                return 330;
            }
        });
    }


    /*
     通用适配器
    */
    @Test
    public void testSpringAdapter() {
        HandleAdapter handleAdapter = new HandleAdapter();
        Handle pc = handleAdapter.adapter("PC");
        pc.handle();
    }
}
