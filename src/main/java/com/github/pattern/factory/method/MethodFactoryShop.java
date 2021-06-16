package com.github.pattern.factory.method;

import com.github.pattern.factory.Phone;

/**
 * MethodFactoryShop
 *
 * @author echils
 * @since 2021-06-16 16:17:14
 */
public class MethodFactoryShop {

    private MethodFactory methodFactory;

    public MethodFactoryShop(MethodFactory methodFactory) {
        this.methodFactory = methodFactory;
    }

    public static void main(String[] args) {

        MethodFactoryShop methodFactoryShop = new MethodFactoryShop(new VIVOMethodFactory());
        methodFactoryShop.sell();
    }

    public void sell() {
        Phone phone = methodFactory.apply();
        phone.introduce();
    }
}
