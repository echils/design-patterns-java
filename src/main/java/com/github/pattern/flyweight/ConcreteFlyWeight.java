package com.github.pattern.flyweight;

/**
 * 具体的享元类
 *
 * @author echils
 */
public class ConcreteFlyWeight implements IFlyWeight {

    /**
     * 内部状态，作为代表属性
     */
    private String name;

    public ConcreteFlyWeight(String name) {
        this.name = name;
    }

    @Override
    public void show(String operate) {
        System.out.println(this + ":" + name + "正在" + operate);
    }
}
