package com.github.pattern.bridge;

/**
 * 网络银行
 *
 * @author echils
 */
public class InternetBank extends Bank {

    public InternetBank(IUser user) {
        super.user = user;
    }

    @Override
    public void transfer() {
        user.name();
        System.out.println("在网上银行转账");
    }
}
