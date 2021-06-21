package com.github.pattern.visitor;

import java.util.Random;

/**
 * 访问者A
 *
 * @author echils
 */
public class VisitorA extends Visitor {

    public VisitorA(String name) {
        super(name);
    }

    @Override
    public void visit(App app) {
        System.out.print(app.getName());
        this.evaluate(app.getName());
    }

    @Override
    public void evaluate(String name) {
        String result = new Random().nextBoolean() ? "做的不错" : "做的一般";
        System.out.println(result);
    }
}
