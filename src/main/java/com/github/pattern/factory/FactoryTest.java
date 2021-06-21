package com.github.pattern.factory;

import com.github.pattern.factory.abs.AbsBasketballOrder;
import com.github.pattern.factory.abs.WilsonFactory;
import com.github.pattern.factory.method.MethodBasketballOrder;
import com.github.pattern.factory.method.SpaldingBasketballFactory;
import com.github.pattern.factory.old.OldBasketballOrder;
import com.github.pattern.factory.simple.SimpleBasketballOrder;
import org.junit.jupiter.api.Test;

/**
 * 工厂模式测试类
 *
 * @author echils
 */
public class FactoryTest {

    /*
        介绍：将实例化对象的代码提取出来，放到一个类中统一管理和维护，达到和主项目依赖关系的解耦，提高可扩展和可维护性
             工厂模式一工有三种：简单工厂模式（静态简单工厂）、工厂方法模式、抽象工厂模式
        细节：
             1）在软件开发中，当我们会用到大量的创建某种、某类或者某批对象时，就要使用工厂模式
             2）创建对象实例时，一定不要直接new对象，而是把这个new对象的操作放在一个工厂的静态方法中，并返回。
             3）工厂方法模式：定义一个创建对象的抽象方法，由子类决定要实例化的类，工厂方法模式的核心就是将对象的实例化推迟的子类
     */

    private static final String SPALDING = "斯伯丁";

    private static final String WILSON = "威尔胜";


    /**
     * 传统的方式实现购买：
     * 优点：代码简单
     * 缺点：耦合度特别高，每一个订购商内部都需要new出来每一个品牌的篮球，违反了设计模式的OCP原则，一旦拓展功能，改动代码量巨大
     * 痛点：如果新增一个品牌的篮球，那么所有的订购商的代码都需要更改自己的代码来满足新的需求，如果有100个厂商呢？
     */
    @Test
    public void testOld() {
        IBasketballOrder basketballOrder = new OldBasketballOrder();
        System.out.println("我要买斯伯丁篮球");
        basketballOrder.order(SPALDING);
        System.out.println("我要买维尔胜篮球");
        basketballOrder.order(WILSON);
    }


    /**
     * 简单工厂实现购买：
     * 优点：每个订购商只需与简单工厂类产生依赖即可，新增一种品牌的篮球只需修改工厂类
     * 思考：如果一个订购商可以从100个工厂中拿货，那么订购商类是不是需要和多个工厂产生耦合，如果新增一个工厂，那么各个订购商同样需要修改类
     */
    @Test
    public void testSimpleFactory() {
        IBasketballOrder basketballOrderB = new SimpleBasketballOrder();
        System.out.println("我要买斯伯丁篮球");
        basketballOrderB.order(SPALDING);
        System.out.println("我要买维尔胜篮球");
        basketballOrderB.order(WILSON);
    }


    /**
     * 工厂方法实现购买：
     * 优点：将工厂具体的生产行为交给子类来进行实现
     */
    @Test
    public void testFactoryMethod() {
        IBasketballOrder basketballOrder = new MethodBasketballOrder(new SpaldingBasketballFactory());
        System.out.println("我要买斯伯丁篮球");
        basketballOrder.order(SPALDING);
        System.out.println("我要买维尔胜篮球");
        basketballOrder.order(WILSON);
    }


    /**
     * 抽象工厂实现购买：
     * 优点：将工厂利用依赖倒转原则设置成抽象的，然后让各种工厂实现它，订购商可以根据需求使用不同的工厂
     * 本例使用通过构造器的方式传递依赖。使用抽象工厂比简单工厂灵活度要更高
     */
    @Test
    public void testAbsFactory() {

        AbsBasketballOrder order = new AbsBasketballOrder(new WilsonFactory());
        System.out.println("我要买斯伯丁篮球");
        order.orderBasketball(SPALDING);
        System.out.println("我要买维尔胜护腕");
        order.orderWristband(WILSON);
    }

}
