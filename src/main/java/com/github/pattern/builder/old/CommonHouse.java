package com.github.pattern.builder.old;

/**
 * 建造者模式测试类
 *
 * @author echils
 */
public class CommonHouse extends AbstractHouse {
    @Override
    void buildBasic() {
        System.out.println("普通房子打地基");
    }

    @Override
    void buildWalls() {
        System.out.println("普通房子砌墙");
    }

    @Override
    void buildRoof() {
        System.out.println("普通房子封顶");
    }
}
