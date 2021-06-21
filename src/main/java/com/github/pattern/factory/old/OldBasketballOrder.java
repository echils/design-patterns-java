package com.github.pattern.factory.old;

import com.github.pattern.factory.IBasketballOrder;
import com.github.pattern.factory.SpaldingBasketball;
import com.github.pattern.factory.WilsonBasketball;

/**
 * 篮球订购商
 *
 * @author echils
 */
public class OldBasketballOrder implements IBasketballOrder {

    public OldBasketballOrder() {
        this.value();
    }

    public void value() {
        System.out.println("欢迎光临传统的篮球订购商");
    }

    public void order(String name) {
        if (name.equals("斯伯丁")) {
            new SpaldingBasketball();
        } else if (name.equals("威尔胜")) {
            new WilsonBasketball();
        } else {
            System.out.println("我们店不卖这种牌子的篮球");
        }
    }
}
