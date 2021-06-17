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
 * @since 2020-01-02 21:34:15
 */
public class Buyer {

    private static final String SPALDING = "斯伯丁";

    private static final String WILSON = "威尔胜";

    @Test
    public void testOld() {

        /*
           传统的方式实现购买：
               优点：代码简单
               缺点：耦合度特别高，每一个订购商内部都需要new出来每一个品牌的篮球，违反了设计模式的OCP原则，一旦拓展功能，改动代码量巨大
               痛点：如果新增一个品牌的篮球，那么所有的订购商的代码都需要更改自己的代码来满足新的需求，如果有100个厂商呢？
         */
        IBasketballOrder basketballOrder = new OldBasketballOrder();
        System.out.println("我要买斯伯丁篮球");
        basketballOrder.order(SPALDING);
        System.out.println("我要买维尔胜篮球");
        basketballOrder.order(WILSON);
    }

    @Test
    public void testSimpleFactory() {

        /*
           简单工厂实现购买：
               优点：每个订购商只需与简单工厂类产生依赖即可，新增一种品牌的篮球只需修改工厂类
               思考：如果一个订购商可以从100个工厂中拿货，那么订购商类是不是需要和多个工厂产生耦合，如果新增一个工厂，那么各个订购商同样需要修改类
         */
        IBasketballOrder basketballOrderB = new SimpleBasketballOrder();
        System.out.println("我要买斯伯丁篮球");
        basketballOrderB.order(SPALDING);
        System.out.println("我要买维尔胜篮球");
        basketballOrderB.order(WILSON);
    }

    @Test
    public void testFactoryMethod() {
         /*
           工厂方法实现购买：
               优点：将工厂具体的生产行为交给子类来进行实现
         */
        IBasketballOrder basketballOrder = new MethodBasketballOrder(new SpaldingBasketballFactory());
        System.out.println("我要买斯伯丁篮球");
        basketballOrder.order(SPALDING);
        System.out.println("我要买维尔胜篮球");
        basketballOrder.order(WILSON);
    }

    @Test
    public void testAbsFactory() {
         /*
           抽象工厂实现购买：
               优点：将工厂利用依赖倒转原则设置成抽象的，然后让各种工厂实现它，订购商可以根据需求使用不同的工厂
                    本例使用通过构造器的方式传递依赖。使用抽象工厂比简单工厂灵活度要更高
         */
        AbsBasketballOrder order = new AbsBasketballOrder(new WilsonFactory());

        System.out.println("我要买斯伯丁篮球");
        order.orderBasketball(SPALDING);
        System.out.println("我要买维尔胜护腕");
        order.orderWristband(WILSON);

    }
}
