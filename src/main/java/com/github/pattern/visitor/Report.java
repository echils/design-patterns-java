package com.github.pattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Report
 *
 * @author echils
 * @since 2020-01-02 23:43:46
 */
public class Report {

    private List<Visitor> visitors = new ArrayList<>();

    public void attach(Visitor visitor) {
        visitors.add(visitor);
    }

    public void detach(Visitor visitor) {
        visitors.remove(visitor);
    }

    public void display(CustomSystem system) {
        for (Visitor visitor : visitors) {
            system.accept(visitor);
        }
    }
}
