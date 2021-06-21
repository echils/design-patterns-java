package com.github.pattern.template;

/**
 * 肉饺子
 *
 * @author echils
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
