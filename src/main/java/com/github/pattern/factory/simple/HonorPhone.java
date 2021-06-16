package com.github.pattern.factory.simple;

import com.github.pattern.factory.Phone;

/**
 * HonorPhone
 *
 * @author echils
 * @since 2021-06-16 11:42:39
 */
class HonorPhone implements Phone {

    @Override
    public void introduce() {
        System.out.println("荣耀手机");
    }
}
