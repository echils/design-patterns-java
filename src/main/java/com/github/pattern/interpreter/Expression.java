package com.github.pattern.interpreter;

/**
 * 解释器表达式
 *
 * @author echils
 */
public interface Expression {

    /**
     * 解释，转义
     */
    boolean interpret(Context context);

}