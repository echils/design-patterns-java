package com.github.pattern.builder;

import com.github.pattern.builder.improve.Car;
import com.github.pattern.builder.improve.CarEngineer;
import com.github.pattern.builder.improve.LincolnCar;
import com.github.pattern.builder.improve.PorscheCar;
import com.github.pattern.builder.old.CommonHouse;
import com.github.pattern.builder.old.CustomHouse;
import org.junit.jupiter.api.Test;

/**
 * 建造者模式测试类
 *
 * @author echils
 * @since 2019-06-19 22:48:11
 */
public class BuilderTest {


    @Test
    public void testOld() {

        /*
          缺点： 没有缓存层对象设计，程序的维护不理想，这种设计方案把产品和创建产品的过程封装在一起，耦合度强
         */
        CommonHouse commonHouse = new CommonHouse();
        commonHouse.build();

        CustomHouse customHouse = new CustomHouse();
        customHouse.build();

    }

    /*
     建造者模式的四个角色：
         1）Product（产品角色）：一个具体的产品对象
         2）Builder（抽象创建者）：创建一个Product对象的创建各个部件指定的接口或抽象类
         3）ConcreteBuilder（具体的建造者）：抽象建造者的实现具体实现类，构建和装配各个部件
         4）Director（指挥者）：构建一个使用Builder接口的对象，用于创建一个复杂的对象。它的两个主要作用：
            1隔离了客户与对象的生产过程2负责控制产品对象的生产过程
     */
    @Test
    public void testImprove() {
        CarEngineer engineer = new CarEngineer(new PorscheCar());
        System.out.println(engineer.build());

        engineer = new CarEngineer(new LincolnCar());
        Car porsche = engineer.build();
        System.out.println(porsche);
    }

}
