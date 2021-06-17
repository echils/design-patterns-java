package com.github.pattern.bridge;

/**
 * ATM取款机
 *
 * @author echils
 * @since 2019-06-18 10:48:11
 */
public class ATMBank extends Bank {

    public ATMBank(IUser user) {
        super.user = user;
    }

    @Override
    public void transfer() {
        user.name();
        System.out.println("在ATM机转账");
    }
}
