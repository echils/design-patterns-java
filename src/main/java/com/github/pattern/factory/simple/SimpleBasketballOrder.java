package com.github.pattern.factory.simple;

import com.github.pattern.factory.IBasketball;
import com.github.pattern.factory.IBasketballOrder;

/**
 * 篮球订购商
 *
 * @author echils
 */
public class SimpleBasketballOrder implements IBasketballOrder {

    public SimpleBasketballOrder() {
        this.value();
    }

    public void value() {
        System.out.println("欢迎光临简单工厂篮球订购商B");
    }

    public void order(String name) {
        IBasketball basketball = BasketballSimpleFactory.createBasketball(name);
        if (basketball != null) {
            basketball.value();
        } else {
            System.out.println("我们店没有这种牌子的篮球");
        }
    }
}
