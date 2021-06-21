package com.github.pattern.visitor;

/**
 * 系统A
 *
 * @author echils
 */
public class AppA extends App {

    public AppA(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        System.out.println(visitor.getName() + "开始评测" + this.getName());
        visitor.visit(this);
    }
}
