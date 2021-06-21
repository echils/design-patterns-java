package com.github.pattern.factory.abs;

import com.github.pattern.factory.IBasketball;

/**
 * 商店
 *
 * @author echils
 */
public class AbsBasketballOrder {

    private IFactory factory;

    public AbsBasketballOrder(IFactory factory) {
        this.value();
        this.factory = factory;
    }

    public void value() {
        System.out.println("欢迎光临");
    }

    public void orderBasketball(String name) {
        IBasketball basketball = factory.createBasketball(name);
        if (basketball != null) {
            basketball.value();
        } else {
            System.out.println("我们店没有这种牌子的篮球");
        }
    }

    public void orderWristband(String name) {
        IWristband wristbands = factory.createWristbands(name);
        if (wristbands != null) {
            wristbands.value();
        } else {
            System.out.println("我们店没有这种牌子的护腕");
        }
    }
}
