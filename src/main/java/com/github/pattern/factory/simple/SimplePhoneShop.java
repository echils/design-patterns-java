package com.github.pattern.factory.simple;

import com.github.pattern.factory.Phone;

/**
 * SimplePhoneShop
 *
 * @author echils
 * @since 2021-06-16 16:12:48
 */
class SimplePhoneShop {

    public static void main(String[] args) {
        SimplePhoneShop phoneShop = new SimplePhoneShop();
        phoneShop.sell("荣耀");
    }

    public void sell(String name) {
        Phone phone = SimpleFactory.apply(name);
        phone.introduce();
    }
}
