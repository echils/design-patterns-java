package com.github.pattern.template;

/**
 * LeekDumplings
 *
 * @author echils
 * @since 2020-01-01 17:25:45
 */
public class LeekDumplings extends Dumplings {
    @Override
    public void stuff() {
        System.out.println("做韭菜馅儿");
    }

    @Override
    public void ingredients() {
        //do nothing at default
        //because of leek dumplings without ingredients is better
    }

    /**
     * 重写钩子刚发
     *
     * @return
     */
    @Override
    public boolean addIngredients() {
        return false;
    }
}
