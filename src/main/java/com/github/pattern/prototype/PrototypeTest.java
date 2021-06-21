package com.github.pattern.prototype;


import com.github.pattern.prototype.deep.DeepPerson1;
import com.github.pattern.prototype.deep.DeepPerson2;
import com.github.pattern.prototype.deep.Friend1;
import com.github.pattern.prototype.deep.Friend2;
import com.github.pattern.prototype.old.Sheep;
import com.github.pattern.prototype.shallow.ShallowAnimal;
import org.junit.jupiter.api.Test;

/**
 * 原型模式测试类
 *
 * @author echils
 */
public class PrototypeTest {

    /*
        介绍：原型模式是一种创建型模式，通过一个对象实例来创造多个可重新定制的对象，而无需知道创建的细节
        细节：
             1）创建新的对象比较复杂时，可以利用原型模式简化对象的创建过程，同时可以提高效率
             2）不用重新初始化对象，而是动态的获取对象运行时的状态
             3）如果原型对象发生了变化，其他克隆对象也会发生相应的变化，无需修改代码
             4）三种克隆方式：1浅克隆，2深克隆。实现深克隆的时候可能需要比较复杂的代码
             5）缺点是每一个类需要配备一个克隆方法，对全新的类来不难，但是对已有的类进行改造，违背ocp原则。
             6）对于是基本数据类型的成员变量，浅拷贝会直接进行值传递，但是对于引用类型的成员变量，浅拷贝只会进行引用传递，也就是说，
                只是将成员变量的内存地址复制一份给新对象，在这种情况下，一个对象修改该成员变量，其他对象多会进行改变
             7）深拷贝会对基本数据类型和引用数据类型的成员变量都进行复制，实现深拷贝的方式有两种：1重写clone方法、2通过对象序列化实现（推荐）
     */

    /**
     * 优点：代码容易理解，简单易操作
     * 缺点：1、在创建新的对象时，总是要获取原始对象的属性值，如果创建的对象比较复杂时，效率比较低
     * 2、总是需要重新初始化对象，而不是动态的获得对象运行时的状态，不够灵活
     * 思考：有一只属性值未知的羊的对象实例，如何克隆10个属性完全一样的羊？
     */
    @Test
    public void testOld() {
        Sheep sheep = new Sheep("白羊", 1, "白色");
        for (int i = 0; i < 10; i++) {
            System.out.println(new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor()));
        }
    }

    /**
     * 浅拷贝
     * 优点：使用原型模式浅克隆来实现对象的克隆，通过对象.clone()即可实现对象的克隆
     * 缺点：当将被克隆的对象中有引用数据类型时，那么引用类型不会进行克隆，只是将引用类型内存地址指向同一地址，任何一个克隆出来
     * 的对象修改该引用数据类型的值，都将影响其他克隆对象
     */
    @Test
    public void testShallow() {
        ShallowAnimal shallowAnimal = new ShallowAnimal();
        shallowAnimal.setName("浅克隆对象");
        shallowAnimal.setAge("100");
        shallowAnimal.setFriend(new ShallowAnimal("浅克隆对象的朋友", "100", null));

        ShallowAnimal shallowAnimal1 = shallowAnimal.clone();
        ShallowAnimal shallowAnimal2 = shallowAnimal.clone();
        ShallowAnimal shallowAnimal3 = shallowAnimal.clone();

        System.out.println(shallowAnimal1);
        System.out.println(shallowAnimal2);
        System.out.println(shallowAnimal3);

        shallowAnimal1.getFriend().setAge("50");
        System.out.println(shallowAnimal1);
        System.out.println(shallowAnimal2);
        System.out.println(shallowAnimal3);

    }

    /**
     * 深拷贝1
     * 优点：使用原型模式深克隆来实现对象的克隆，当将被克隆的对象中有引用数据类型时，同样会进行克隆，互相之间没有影响
     * 缺点：如果引用类型有很多，那么clone()方法将会很臃肿
     */
    @Test
    public void testDeepPerson1() {

        DeepPerson1 deepPerson1 = new DeepPerson1();
        deepPerson1.setName("深克隆对象1");
        deepPerson1.setAge(100);
        deepPerson1.setFriend(new Friend1("深克隆对象1的朋友"));

        DeepPerson1 deepPerson11 = deepPerson1.clone();
        DeepPerson1 deepPerson12 = deepPerson1.clone();
        DeepPerson1 deepPerson13 = deepPerson1.clone();

        System.out.println(deepPerson11);
        System.out.println(deepPerson12);
        System.out.println(deepPerson13);

        deepPerson11.getFriend().setName("深克隆对象1的盆友");
        System.out.println(deepPerson11);
        System.out.println(deepPerson12);
        System.out.println(deepPerson13);

    }

    /**
     * 深拷贝2
     * 优点：使用原型模式深克隆来实现对象的克隆，当将被克隆的对象中有引用数据类型时，同样会进行克隆，互相之间没有影响
     * 并且即使有多个引用类型也无影响，开发中推荐使用
     */
    @Test
    public void testDeepPerson2() {

        DeepPerson2 deepPerson2 = new DeepPerson2();
        deepPerson2.setName("深克隆对象1");
        deepPerson2.setAge(100);
        deepPerson2.setFriend(new Friend2("深克隆对象2的朋友"));

        DeepPerson2 deepPerson21 = deepPerson2.clone();
        DeepPerson2 deepPerson22 = deepPerson2.clone();
        DeepPerson2 deepPerson23 = deepPerson2.clone();

        System.out.println(deepPerson21);
        System.out.println(deepPerson22);
        System.out.println(deepPerson23);

        deepPerson21.getFriend().setName("深克隆对象2的盆友");
        System.out.println(deepPerson21);
        System.out.println(deepPerson22);
        System.out.println(deepPerson23);

    }
}
