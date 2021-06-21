package com.github.pattern.visitor;

/**
 * 应用B
 *
 * @author echils
 */
public class AppB extends App {

    public AppB(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        System.out.println(visitor.getName() + "开始评测" + this.getName());
        visitor.visit(this);
    }
}
