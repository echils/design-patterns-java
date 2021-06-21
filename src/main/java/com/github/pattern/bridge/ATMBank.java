package com.github.pattern.bridge;

/**
 * ATM取款机
 *
 * @author echils
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
