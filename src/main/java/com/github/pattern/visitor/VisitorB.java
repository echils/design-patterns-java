package com.github.pattern.visitor;

/**
 * 访问者B
 *
 * @author echils
 */
public class VisitorB extends Visitor {

    public VisitorB(String name) {
        super(name);
    }

    @Override
    public void visit(App app) {
        java.lang.System.out.print(app.getName());
        this.evaluate(app.getName());
    }

    @Override
    public void evaluate(String name) {
        if (name.equals("智能运检系统")) {
            java.lang.System.out.println("做的不错");
        } else {
            java.lang.System.out.println("做的一般");
        }
    }
}
