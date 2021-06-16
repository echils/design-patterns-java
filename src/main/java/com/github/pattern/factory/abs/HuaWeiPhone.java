package com.github.pattern.factory.abs;

import com.github.pattern.factory.Phone;

/**
 * HuaWeiPhone
 *
 * @author echils
 * @since 2021-06-16 16:23:00
 */
public class HuaWeiPhone implements Phone {

    @Override
    public void introduce() {
        System.out.println("华为手机");
    }
}
