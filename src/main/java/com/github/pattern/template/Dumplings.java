package com.github.pattern.template;

/**
 * Dumplings
 *
 * @author echils
 * @since 2020-01-01 17:20:03
 */
public abstract class Dumplings {

    /**
     * 模板方法
     */
    public final void execute() {
        knead();
        stuff();
        pack();
        cook();
        if (addIngredients()) {
            ingredients();
        }
    }


    public void knead() {
        System.out.println("和面");
    }

    public abstract void stuff();

    public void pack() {
        System.out.println("包饺子");
    }

    public void cook() {
        System.out.println("煮");
    }

    public abstract void ingredients();

    /**
     * 钩子方法
     *
     * @return
     */
    public boolean addIngredients() {
        return true;
    }
}
