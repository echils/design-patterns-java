package com.github.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 大学，大学一般有几个校区
 *
 * @author echils
 * @since 2020-01-01 21:59:52
 */
public class University extends Component {

    //用于存储子节点-校区
    private List<Component> campuses = new ArrayList<>();

    public University(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        campuses.add(component);
    }

    @Override
    public void remove(Component component) {
        campuses.remove(component);
    }

    @Override
    void show() {
        System.out.println(getName() + ":");
        campuses.forEach(c -> System.out.println(c.getName()));
    }
}
