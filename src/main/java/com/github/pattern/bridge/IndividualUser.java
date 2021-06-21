package com.github.pattern.bridge;

/**
 * 银行个人用户
 *
 * @author echils
 */
public class IndividualUser implements IUser {
    @Override
    public void name() {
        System.out.print("银行个人用户");
    }
}
