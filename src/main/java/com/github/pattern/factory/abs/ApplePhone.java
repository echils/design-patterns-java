package com.github.pattern.factory.abs;

import com.github.pattern.factory.Phone;

/**
 * ApplePhone
 *
 * @author echils
 * @since 2021-06-16 16:22:08
 */
public class ApplePhone implements Phone {

    @Override
    public void introduce() {
        System.out.println("苹果手机");
    }
}
