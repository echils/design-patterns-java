package com.github.pattern.interpreter;

import org.junit.jupiter.api.Test;

/**
 * 解释器模式测试类
 *
 * @author echils
 */
public class InterpreterTest {

    /*

        介绍：
             1）在编译原理中，一个算术表达式通过词法分析器形成词法单元，而后这些词法单元再通过语法分析器构建语法分析树，最终形成一颗
                抽象的语法分析树，这里的词法分析器和语法分析器都可以看作是解释器
             2）解释器模式i：是指给定一个语言（表达式），定义他的文法的一种表示，并定义一个解释器，使用该解释器来解释语言中的表达式

     */


    @Test
    public void test(){
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
