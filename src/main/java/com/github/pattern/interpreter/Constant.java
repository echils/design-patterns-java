package com.github.pattern.interpreter;

/**
 * 常数表达式
 *
 * @author echils
 * @since 2020-01-14 22:28:32
 */
public class Constant implements Expression {

    private Boolean value;

    public Constant(boolean value) {
        this.value = value;
    }

    @Override
    public boolean interpret(Context ctx) {
        return value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}