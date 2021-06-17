package com.github.pattern.visitor;

import java.util.Random;

/**
 * CommonVisitor
 *
 * @author echils
 * @since 2020-01-05 15:13:35
 */
public class CommonVisitor extends Visitor {

    public CommonVisitor(String name) {
        super(name);
    }

    @Override
    public void visit(CustomSystem system) {
        System.out.println(system.getName());
        this.evaluate(system.getName());
    }

    @Override
    public void evaluate(String name) {
        String result = new Random().nextBoolean() ? "做的不错" : "做的一般";
        System.out.println(result);
    }
}
