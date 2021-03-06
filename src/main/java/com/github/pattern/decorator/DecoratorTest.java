package com.github.pattern.decorator;

import org.junit.jupiter.api.Test;

/**
 * 装饰器模式测试类
 *
 * @author echils
 */
public class DecoratorTest {

    /*

        介绍：动态的将新功能附加到对象上，同时又不改变其结构。这种类型的设计模式属于结构型模式，它是作为现有的类的一个包装
        细节：主体类为抽象，修饰类实现主体类并引用主体类，具体的主体类和修饰类抖留给子类实现
             1）Component为统一接口，也是装饰类和被装饰类的基本类型
             2）ConcreteComponent为具体实现类，也是被装饰类，他本身是个具有一些功能的完整的类
             3）Decorator是装饰类，实现了Component接口的同时还在内部维护了一个ConcreteComponent的实例，并可以通过构造函数初始化。
                而Decorator本身，通常采用默认实现，他的存在仅仅是一个声明：我要生产出一些用于装饰的子类了。而其子类才是赋有具体装饰效果的装饰产品类
             4）ConcreteDecorator是具体的装饰产品类，每一种装饰产品都具有特定的装饰效果。可以通过构造器声明装饰哪种类型的ConcreteComponent，从而对其进行装饰。

     */

    @Test
    public void test() {
        Phone phone = new ApplePhone();
        phone.show();
        System.out.println("-----------");
        PhoneShell phoneShell = new PhoneShell(phone);
        phoneShell.show();
        System.out.println("-----------");
        PhoneFilm phoneFilm = new PhoneFilm(phoneShell);
        phoneFilm.show();
    }

}
