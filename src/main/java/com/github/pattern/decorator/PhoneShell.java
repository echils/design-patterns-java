package com.github.pattern.decorator;

/**
 * 手机壳
 *
 * @author echils
 */
public class PhoneShell extends PhoneDecorator {

    public PhoneShell(Phone phone) {
        super(phone);
    }

    @Override
    public void show() {
        phone.show();
        System.out.println("手机壳真好看");
    }
}
