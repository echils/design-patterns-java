package com.github.pattern.visitor;

/**
 * Visitor
 *
 * @author echils
 * @since 2020-01-02 23:32:03
 */
public abstract class Visitor {

    private String name;

    public Visitor(String name) {
        this.name = name;
    }

    public abstract void visit(CustomSystem system);

    public abstract void evaluate(String name);

    public String getName() {

        return name;
    }
}
