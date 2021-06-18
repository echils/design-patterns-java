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

        介绍：
             1）适配器模式是将某个类的接口装换成客户端期望的另一个接口表示，主要的目的是兼容性，让原本因结构不匹配不能一起工作的两个类可以
                协同工作，其别名为包装器（生活中常见例子：插座转换器）
             2）适配器模式属于结构型模式
             3）适配器分为三类：类适配器模式、对象适配器模式、解耦适配器模式
             4）在实际开发中不拘泥于这三种适配器，可以学习掌握Spring的适配器，更加合理
        细节：
             1）类适配器模式的注意事项和细节：
                <1>Java是单继承机制，所以类适配器需要继承被适配者类这一点算是一个缺点，因此这要求目标类必须是接口，有一定的局限性
                <2>目标类的方法在adapter中都会暴露出来，也增加了使用的成本
                <3>由于其继承了被适配者类，所以它可以根据需求重写被适配者类，使得adapter灵活性增强
             2）对象适配器模式的注意事项和细节：
                <1>对象适配器模式和类适配器模式相同，只是根据合成复用原则将继承被适配者类改为持有被适配者类的实例，使用组合替代了继承，解决了
                   类适配器目标类必须是接口的问题
             3）接口适配器模式的注意事项和细节
                <1>适用于一个接口不想使用其所有的方法的情况，可以先设计一个抽象类实现接口，并为该接口中的每个方法提供默认的实现方法（空方法），
                   那么该抽象类的自雷可有选择地覆盖覆盖父类的某些方法来适配需求
             4）开发中推荐并掌握spring的适配器模式
     */


    /**
     * 类适配器
     * 缺点：Java只能单继承，所以适配其他类型时只能选择选择实现接口的方式
     */
    @Test
    public void testClassAdapter() {
        VoltageClassAdapter voltageClassAdapter = new VoltageClassAdapter();
        System.out.println(voltageClassAdapter.output220V());
        System.out.println(voltageClassAdapter.output330V());
    }


    /**
     * 对象适配器
     * 优点：解决上面的问题，适配其他类型时选择的方式更多
     * 缺点：通过了聚合的方式增加了耦合度
     */
    @Test
    public void testObjectAdapter() {
        VoltageClassAdapter voltageClassAdapter = new VoltageClassAdapter();
        System.out.println(voltageClassAdapter.output220V());
        System.out.println(voltageClassAdapter.output330V());
    }


    /**
     * 接口适配器
     * 适用于一个接口不想适用其所有方法的情况
     * 当不需要全部实现接口提供的方法时，可先设计一个抽象类实现接口，并为该接口中每个方法提供一个默认实现（空方法），
     * 那么该抽象类的子类可有选择的覆盖父类的某些放啊来实现需求
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

    /**
     * 通用适配器
     */
    @Test
    public void testSpringAdapter() {
        HandleAdapter handleAdapter = new HandleAdapter();
        Handle pc = handleAdapter.adapter("PC");
        pc.handle();
    }

}
