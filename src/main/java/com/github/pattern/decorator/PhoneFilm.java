package com.github.pattern.decorator;

/**
 * 手机膜
 *
 * @author echils
 * @since 2020-01-01 23:15:06
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
