package com.github.pattern.template;

/**
 * 肉饺子
 *
 * @author echils
 * @since 2020-01-01 17:25:45
 */
public class MeatDumplings extends Dumplings {

    @Override
    public void stuff() {
        System.out.println("做肉馅儿");
    }

    @Override
    public void ingredients() {
        System.out.println("制作辣椒蘸料");
    }

}
