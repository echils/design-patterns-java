package com.github.pattern.interpreter;

/**
 * 变量表达式
 *
 * @author echils
 * @since 2020-01-14 22:28:32
 */
public class Variable implements Expression {

    private String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public boolean interpret(Context ctx) {
        return ctx.get(this);
    }

    @Override
    public String toString() {
        return this.name;
    }
}