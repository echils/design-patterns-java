package com.github.pattern.builder.old;

/**
 * 建造者模式测试类
 *
 * @author echils
 * @since 2019-06-19 22:49:25
 */
public class CustomHouse extends AbstractHouse {
    @Override
    void buildBasic() {
        System.out.println("别墅打地基");
    }

    @Override
    void buildWalls() {
        System.out.println("别墅子砌墙");
    }

    @Override
    void buildRoof() {
        System.out.println("别墅封顶");
    }
}
