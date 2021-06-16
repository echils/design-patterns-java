package com.github.pattern.factory.simple;

import com.github.pattern.factory.Phone;

/**
 * 简单工厂
 *
 * @author echils
 * @since 2021-06-16 11:37:35
 */
class SimpleFactory {

    public static Phone apply(String name) {
        if ("小米".equals(name)) {
            return new MiPhone();
        } else if ("荣耀".equals(name)) {
            return new HonorPhone();
        }
        throw new RuntimeException("不生产" + name + "手机");
    }

}
