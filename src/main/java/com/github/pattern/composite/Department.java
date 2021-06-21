package com.github.pattern.composite;

/**
 * 系
 *
 * @author echils
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
