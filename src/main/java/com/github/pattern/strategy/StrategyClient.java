package com.github.pattern.strategy;

/**
 * StrategyClient
 *
 * @author echils
 * @since 2020-01-18 14:51:45
 */
public class StrategyClient {

    public static void main(String[] args) {
        Dunk dunk1 = new Dunk("小黑", "黑", new NoFlyBehavior(), new SwimFastBehavior());
        dunk1.display();
        System.out.println("===========");
        Dunk dunk2 = new Dunk("小白", "白", new FlyHighBehavior(), new SwimSlowBehavior());
        dunk2.display();
    }
}
