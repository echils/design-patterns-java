package com.github.pattern.visitor;

/**
 * AseitSystem
 *
 * @author echils
 * @since 2020-01-02 23:35:58
 */
public class AseitSystem extends CustomSystem {

    public AseitSystem(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        System.out.println(visitor.getName() + "开始评测" + this.getName());
        visitor.visit(this);
    }
}
