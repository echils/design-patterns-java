package com.github.pattern.decorator;

/**
 * 手机装饰器
 *
 * @author echils
 */
public class PhoneDecorator implements Phone {

    public Phone phone;

    public PhoneDecorator(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void show() {
    }
}
