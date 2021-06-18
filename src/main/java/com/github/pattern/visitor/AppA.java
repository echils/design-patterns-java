package com.github.pattern.visitor;

/**
 * 系统A
 *
 * @author echils
 * @since 2020-01-02 23:38:25
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
