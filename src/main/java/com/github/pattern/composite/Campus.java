package com.github.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 校区,每个校区有很多系
 *
 * @author echils
 * @since 2020-01-01 22:01:47
 */
public class Campus extends Component {

    /**
     * 用于储存系
     */
    private List<Component> departments = new ArrayList<>();

    public Campus(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        departments.add(component);
    }

    @Override
    public void remove(Component component) {
        departments.remove(component);
    }

    @Override
    void show() {
        System.out.println(getName() + ":");
        departments.forEach(de -> System.out.println(de.getName()));
    }
}
