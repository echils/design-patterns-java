package com.github.pattern.proxy.dynamic;

/**
 * Student
 *
 * @author echils
 * @since 2020-01-05 22:30:02
 */
public class Student implements IPerson {
    @Override
    public void buy() {
        System.out.println("买买买");
    }

    @Override
    public void sell() {
        System.out.println("卖卖卖");
    }
}
