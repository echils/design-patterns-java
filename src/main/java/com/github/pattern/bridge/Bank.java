package com.github.pattern.bridge;

/**
 * 银行
 *
 * @author echils
 */
public abstract class Bank {

    IUser user;

    public abstract void transfer();

}
