package com.github.pattern.bridge;

/**
 * 银行企业用户
 *
 * @author echils
 * @since 2019-06-18 19:48:11
 */
public class EnterpriseUser implements IUser {

    @Override
    public void name() {
        System.out.print("银行企业用户");
    }
}
