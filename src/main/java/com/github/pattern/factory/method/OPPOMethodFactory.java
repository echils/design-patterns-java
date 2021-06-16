package com.github.pattern.factory.method;

import com.github.pattern.factory.Phone;

/**
 * OPPOMethodFactory
 *
 * @author echils
 * @since 2021-06-16 14:31:43
 */
public class OPPOMethodFactory extends MethodFactory {

    @Override
    public Phone apply() {
        return new OPPOPhone();
    }

    public static class OPPOPhone implements Phone {
        @Override
        public void introduce() {
            System.out.println("OPPO手机");
        }
    }

}

