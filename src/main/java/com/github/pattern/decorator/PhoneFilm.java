package com.github.pattern.decorator;

/**
 * 手机膜
 *
 * @author echils
 */
public class PhoneFilm extends PhoneDecorator {

    public PhoneFilm(Phone phone) {
        super(phone);
    }

    @Override
    public void show() {
        phone.show();
        System.out.println("手机膜真舒服");
    }
}
