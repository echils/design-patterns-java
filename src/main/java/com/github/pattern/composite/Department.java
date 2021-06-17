package com.github.pattern.composite;

/**
 * 系
 *
 * @author echils
 * @since 2020-01-01 22:03:36
 */
public class Department extends Component {

    public Department(String name) {
        super(name);
    }

    @Override
    void show() {
        System.out.println(super.getName());
    }
}
