package com.github.pattern.interpreter;

/**
 * OR表达式
 *
 * @author echils
 * @since 2020-01-14 22:28:32
 */
public class Or implements Expression {

    private Expression left, right;

    public Or(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean interpret(Context ctx) {
        return left.interpret(ctx) || right.interpret(ctx);
    }

    @Override
    public String toString() {
        return "(" + left.toString() + " OR " + right.toString() + ")";
    }
}