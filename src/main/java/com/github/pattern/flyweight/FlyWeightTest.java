package com.github.pattern.flyweight;

import org.junit.jupiter.api.Test;

/**
 * 享元模式测试类
 *
 * @author echils
 */
public class FlyWeightTest {

    /*

        介绍：
             1）享元模式也叫蝇量模式：运用共享技术有效的支持大量细粒度的对象.避免重复创建对象，节省内存空间。
                根据内部状态把对象存储在共享池，需要时去共享池取就行。
             2）常用于系统底层开发，解决系统的性能问题。像数据库连接池，里面都是创建好的连接对象，在这些连接对象中有我们需要的则直接拿来用，
                避免重新创建，如果没有我们需要的，则创建一个。
             3）享元模式能够解决重复对象的内存浪费的问题，当系统中有大量相似对象，需要缓冲池时，不需要总是创建新对象，可以从缓冲池里拿，
                这样可以降低系统内存，同事提高效率。
             4）享元模式经典的应用场景就是池技术，String常量池、数据库连接池、缓冲池等等都是享元模式的应用，享元模式是池技术的重要实现方式
             5）享元模式的使用前提是要分析出对象的内部状态和外部状态
                内部状态：指对象共享出来的内容信息，储存在享元对象内部且不会随环境的改变而改变
                外部状态：指对象得以依赖的一个标记，是随着环境改变而改变的、不可共享的状态
        细节：
             1）在享元模式中，享代表共享，元代表对象
             2）系统中有大量对象，这些对象消耗大量内存，并且对象的状态大部分可以外部化时，我们就可以考虑使用享元模式
             3）用唯一标识码判断，如果在内存中有，则返回这个标识码对应的对象，用HashMap/HashTable存储
             4）享元模式大大减少对象的创建，降低了程序内存的占用，提高效率
             5）享元模式提高了系统的复杂度。需要分离出内部状态和外部状态，而外部状态具有固化特性，不应该随着内部装填的改变而改变，这是我们
                使用享元模式需要注意的地方
             6）使用享元模式时，注意划分内部状态和外部状态，并且需要有一个工厂了加以控制
             7）享元模式使用时，要考虑线程安全问题
             8）Integer.valueOf(int i)方法采用享元模式，当-128<i<127时，返回的Integer对象将会同缓存池中取出，这时A==B为true

     */


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
