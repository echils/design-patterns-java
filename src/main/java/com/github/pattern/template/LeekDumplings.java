package com.github.pattern.template;

/**
 * 韭菜饺子
 *
 * @author echils
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
