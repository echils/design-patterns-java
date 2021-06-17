package com.github.pattern.interpreter;

/**
 * 解释器表达式
 *
 * @author echils
 * @since 2020-01-14 22:28:32
 */
public interface Expression {

    /**
     * 解释，转义
     */
    boolean interpret(Context context);

}