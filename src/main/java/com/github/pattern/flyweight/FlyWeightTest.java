package com.github.pattern.flyweight;

import org.junit.jupiter.api.Test;

/**
 * 享元模式测试类
 *
 * @author echils
 * @since 2021-06-17 16:26:58
 */
public class FlyWeightTest {

    @Test
    public void test() {

        FlyweightFactory flyweightFactory = new FlyweightFactory();

        //虽然客户端申请了5个享元对象，但是实际创建的享元对象只有1个，也就是缓存
        IFlyWeight flyWeight1 = flyweightFactory.apply("张三");
        flyWeight1.show("搬砖");

        IFlyWeight flyWeight2 = flyweightFactory.apply("张三");
        flyWeight2.show("睡觉");

        IFlyWeight flyWeight3 = flyweightFactory.apply("张三");
        flyWeight3.show("继续搬砖");
    }
}
