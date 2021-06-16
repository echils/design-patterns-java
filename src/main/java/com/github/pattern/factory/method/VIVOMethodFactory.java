package com.github.pattern.factory.method;

import com.github.pattern.factory.Phone;

/**
 * VIVOMethodFactory
 *
 * @author echils
 * @since 2021-06-16 14:31:43
 */
public class VIVOMethodFactory extends MethodFactory {

    @Override
    public Phone apply() {
        return new VIVOPhone();
    }

    public static class VIVOPhone implements Phone {
        @Override
        public void introduce() {
            System.out.println("VIVO手机");
        }
    }

}

