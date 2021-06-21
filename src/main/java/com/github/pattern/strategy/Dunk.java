package com.github.pattern.strategy;

/**
 * Dunk
 *
 * @author echils
 */
public class Dunk {

    private String name;

    private String color;

    private IFlyBehavior flyBehavior;

    private ISwimBehavior swimBehavior;

    public Dunk(String name, String color, IFlyBehavior flyBehavior, ISwimBehavior swimBehavior) {
        this.name = name;
        this.color = color;
        this.flyBehavior = flyBehavior;
        this.swimBehavior = swimBehavior;
    }

    public void display() {
        System.out.println(toString());
        flyBehavior.fly();
        swimBehavior.swim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public IFlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(IFlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public ISwimBehavior getSwimBehavior() {
        return swimBehavior;
    }

    public void setSwimBehavior(ISwimBehavior swimBehavior) {
        this.swimBehavior = swimBehavior;
    }

    @Override
    public String toString() {
        return "Dunk{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
