package com.github.pattern.visitor;

/**
 * HikVisitor
 *
 * @author echils
 * @since 2020-01-02 23:42:28
 */
public class HikVisitor extends Visitor {
    public HikVisitor(String name) {
        super(name);
    }

    @Override
    public void visit(CustomSystem system) {
        System.out.print(system.getName());
        this.evaluate(system.getName());
    }

    @Override
    public void evaluate(String name) {
        if (name.equals("智能运检系统")) {
            System.out.println("做的一般");
        } else {
            System.out.println("做的不错");
        }
    }
}
