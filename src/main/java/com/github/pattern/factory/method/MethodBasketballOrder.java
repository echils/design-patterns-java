package com.github.pattern.factory.method;

import com.github.pattern.factory.IBasketball;
import com.github.pattern.factory.IBasketballOrder;

/**
 * 篮球订购商
 *
 * @author echils
 */
public class MethodBasketballOrder implements IBasketballOrder {

    private AbstractBasketballFactory basketballFactory;

    public MethodBasketballOrder(AbstractBasketballFactory basketballFactory) {
        this.value();
        this.basketballFactory = basketballFactory;
    }

    public void value() {
        System.out.println("欢迎光临工厂方法篮球订购商");
    }

    public void order(String name) {
        IBasketball basketball = basketballFactory.createBasketball(name);
        if (basketball != null) {
            basketball.value();
        } else {
            System.out.println("我们店没有这种牌子的篮球");
        }
    }

}
