package com.github.pattern.interpreter;

/**
 * 解释器模式
 *
 * @author echils
 * @since 2020-01-14 22:28:32
 */
public class InterpreterClient {

    public static void main(String[] args) {

        Context context = new Context();

        Variable x = new Variable("X");
        Variable y = new Variable("Y");
        context.set(x, false);
        context.set(y, true);

        Expression expression = new Or(new And(new Constant(true), x), new And(y, new Not(x)));
        System.out.println("X = " + x.interpret(context));
        System.out.println("Y = " + y.interpret(context));
        System.out.println(expression.toString() + " = " + expression.interpret(context));
    }
}
