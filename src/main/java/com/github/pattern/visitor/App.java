package com.github.pattern.visitor;

/**
 * 抽象系统类
 *
 * @author echils
 */
public abstract class App {

    private String name;

    public App(String name) {
        this.name = name;
    }

    public abstract void accept(Visitor visitor);

    public String getName() {
        return name;
    }

}
