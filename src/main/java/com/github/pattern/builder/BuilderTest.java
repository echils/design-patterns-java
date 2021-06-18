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

    /*

        介绍：建造者模式幼教生成器模式，时一种对象构建模式，它可以将复杂的对象和建造过程抽象出来，使这个抽象过程的不同实现方法可以构建出不同的对象
             建造者模式的四个角色：
             1）Product（产品角色）：一个具体的产品对象
             2）Builder（抽象创建者）：创建一个Product对象的创建各个部件指定的接口或抽象类
             3）ConcreteBuilder（具体的建造者）：抽象建造者的实现具体实现类，构建和装配各个部件
             4）Director（指挥者）：构建一个使用Builder接口的对象，用于创建一个复杂的对象。它的两个主要作用： 1、隔离了客户与对象的生产过程 2、负责控制产品对象的生产过程
        细节：
             1）客户端不必知道产品内部组成的细节，将产品本身与产品的创建过程解耦，是的相同的创建过程可以创建不同的产品对象
             2）每个具体建造者都是相对独立，而与其他的具体建造者无关，一次可以很方便的替换具体建造者或增加新的建造者，
                用户使用不同的具体建造者即可得到不同的产品对象
             3）可以更加精细的控制产品的创建过程，将复杂产品的创建步骤分散在不同的方法中，使得创建过程更加清晰，也更方便使用程序来控制
                创建过程
             4）增加新的具体建造者无须修改原有类库的代码，指挥者类针对抽象建造者类编程，系统扩展方便，符合"开闭原则"。
             5）建造者模式所创建的产品一般具有较多的共同点，其组成部分相似，如果产品的差异性很大，则不适合使用建造者模式，
                因此使用范围搜到一定的限制
             6）如果产品的内部变化复杂，可能会导致需要定义很多具体建造者类来实现这种变化，导致系统变得很庞大，因此在这种情况下，要考虑是否
                适合使用建造者模式
             7) 抽象工厂模式VS建造者模式
                抽象工厂模式实现对产品家族的创建，一个产品家族是这样的一系列产品：具有不同分类唯独的产品组合，采用抽象工厂模式不需要关心构建
                过程，只关心什么产品由什么工厂生产即可，而建造者模式则是要求按照指定的蓝图建造产品，他的主要目的是通过组装零配件而产生一个新产品

     */


    /**
     * 没有缓存层对象设计，程序的维护不理想，这种设计方案把产品和创建产品的过程封装在一起，耦合度强
     */
    @Test
    public void testOld() {

        CommonHouse commonHouse = new CommonHouse();
        commonHouse.build();

        CustomHouse customHouse = new CustomHouse();
        customHouse.build();

    }


    /**
     * 建造者模式
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
