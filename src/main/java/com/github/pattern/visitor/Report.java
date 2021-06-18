package com.github.pattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 测评中心
 *
 * @author echils
 * @since 2020-01-02 23:43:46
 */
public class Report {

    /**
     * 访问者
     */
    private List<Visitor> visitors = new ArrayList<>();

    /**
     * 邀请访问者
     */
    public void attach(Visitor visitor) {
        visitors.add(visitor);
    }

    /**
     * 测评
     *
     * @param app
     */
    public void measure(App app) {
        for (Visitor visitor : visitors) {
            app.accept(visitor);
        }
    }
}
