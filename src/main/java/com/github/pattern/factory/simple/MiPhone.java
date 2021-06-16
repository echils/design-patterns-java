package com.github.pattern.factory.simple;

import com.github.pattern.factory.Phone;

/**
 * MiPhone
 *
 * @author echils
 * @since 2021-06-16 11:42:39
 */
class MiPhone implements Phone {

    @Override
    public void introduce() {
        System.out.println("小米手机");
    }
}
