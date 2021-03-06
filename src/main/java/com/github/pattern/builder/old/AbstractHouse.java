package com.github.pattern.builder.old;

/**
 * 建造者模式测试类
 *
 * @author echils
 */
public abstract class AbstractHouse {

    /**
     * 打地基
     */
    abstract void buildBasic();

    /**
     * 砌墙
     */
    abstract void buildWalls();

    /**
     * 封顶
     */
    abstract void buildRoof();

    /**
     * 创建流程
     */
    public void build() {
        buildBasic();
        buildWalls();
        buildRoof();
    }
}
