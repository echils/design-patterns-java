package com.github.pattern.bridge;

/**
 * 银行
 *
 * @author echils
 * @since 2019-06-18 10:48:11
 */
public abstract class Bank {

    IUser user;

    public abstract void transfer();

}
