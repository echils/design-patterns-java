package com.github.pattern.iterator;

import org.junit.jupiter.api.Test;

import java.util.Iterator;

/**
 * 迭代器模式测试类
 *
 * @author echils
 * @since 2020-01-05 21:35:31
 */
public class IteratorTest {

    /*

        介绍：
             1）如果我么你的集合元素是用不同的方式实现的，有数组、Java集合类或者其他方式，当客户端要遍历这些集合元素的时候
                要使用多种遍历方式而且还会暴露元素的内部结构。这个时候考虑使用迭代器模式
             2）迭代器模式提供一种遍历集合元素的统一接口，用一致的方法遍历集合元素，不需要暴露内部结构
             3）主要角色和职责：
                1）Iterator: 迭代器接口，包含hasNext(),next(),remove()方法
                2）ConcreteIterator:具体的迭代器类，管理迭代
                3）Aggregate: 一个统一的聚合接口，将客户端和具体聚合耦合
                4）ConcreteAggregate:具体的聚合持有对象结合，并提供一个方法，返回一个迭代器，该迭代器可以正确遍历集合
        细节：
             1）提供一个统一的方法遍历对象，客户不用再考虑聚合的类型，使用一种方法就可以遍历对象了
             2）隐藏了聚合的内部结构，客户端要遍历的时候只能取到迭代器，而不会知道聚合的聚合组成
             3）提供了一种设计思想，就是一个类应该只有一个引起变化的原因（单一职责原则）。在聚合类中，我们把迭代器分开，就是要把管理对象
                集合和遍历对象集合的责任分开，这样一来集合改变的话，只影响到聚合对象，而如果遍历方式改变的化，只影响到迭代器

     */


    @Test
    public void test() {
        introduce(new WestAllStarTeam());
        introduce(new EastAllStarTeam());
    }

    private void introduce(IAllStarTeam allStarTeam) {
        System.out.println(allStarTeam.getTeamName() + ":");
        Iterator<Player> iterator = allStarTeam.createIterator();
        while (iterator.hasNext()) {
            System.out.println("-:" + iterator.next().getName());
        }
    }

}
