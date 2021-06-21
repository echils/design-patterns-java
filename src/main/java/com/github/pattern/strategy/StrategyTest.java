package com.github.pattern.strategy;

import org.junit.jupiter.api.Test;

/**
 * 策略模式测试类
 *
 * @author echils
 */
public class StrategyTest {

    /*
        介绍：
             1）策略模式：定义算法簇，分别封装起来，让他们之间可以相互替换，此模式让算法的变化独立于使用算法的客户
             2）策略模式使用到的设计原则：
                1、把变化的代码从不变的代码中分离出来；
                2、针对接口编程而不是具体类
                3、多用组合/聚合，少用继承
        细节：
             1）策略模式的关键： 分析项目中变化部分与不变部分
             2）策略模式的核心思想： 多用组合、聚合，少用继承；组合行为，而不是继承行为；成员变量为抽象，提供缓冲层，更有弹性
             3）体现了开闭原则，扩展不需要修改原有代码，只需要增加行的行为策略即可
     */

    @Test
    public void test() {
        Dunk dunk1 = new Dunk("小黑", "黑", new NoFlyBehavior(), new SwimFastBehavior());
        dunk1.display();
        System.out.println("===========");
        Dunk dunk2 = new Dunk("小白", "白", new FlyHighBehavior(), new SwimSlowBehavior());
        dunk2.display();
    }

}
