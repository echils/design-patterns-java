package com.github.pattern.composite;

import lombok.Data;

/**
 * 组合声明对象（抽象类或者接口）
 * <p>
 * add方法和remove方法具体实现由子类决定，但为什么不设置成抽象方法呢？
 * 原因是因为叶子节点是没有添加的删除的，如果不是所有子类都需要实现的方法，那么不要定义成抽象方法，
 * 可以采用定义默认行为的形式声明方法
 *
 * @author echils
 * @since 2020-01-01 21:54:26
 */
@Data
public abstract class Component {

    private String name;

    public Component(String name) {
        this.name = name;
    }

    public void add(Component component) {
        throw new UnsupportedOperationException();
    }

    public void remove(Component component) {
        throw new UnsupportedOperationException();
    }

    abstract void show();
}
