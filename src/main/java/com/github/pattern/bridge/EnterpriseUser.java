package com.github.pattern.bridge;

/**
 * 银行企业用户
 *
 * @author echils
 */
public class EnterpriseUser implements IUser {

    @Override
    public void name() {
        System.out.print("银行企业用户");
    }
}
