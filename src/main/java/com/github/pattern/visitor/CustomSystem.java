package com.github.pattern.visitor;

/**
 * CustomSystem
 *
 * @author echils
 * @since 2020-01-02 23:33:17
 */
public abstract class CustomSystem {

    private String name;

    public CustomSystem(String name) {
        this.name = name;
    }

    public abstract void accept(Visitor visitor);

    public String getName() {
        return name;
    }
}
