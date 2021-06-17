package com.github.pattern.bridge;

/**
 * 银行个人用户
 *
 * @author echils
 * @since 2019-06-18 19:49:10
 */
public class IndividualUser implements IUser {
    @Override
    public void name() {
        System.out.print("银行个人用户");
    }
}
