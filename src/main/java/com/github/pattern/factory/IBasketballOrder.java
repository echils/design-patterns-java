package com.github.pattern.factory;

/**
 * 篮球订购商基础类
 *
 * @author echils
 */
public interface IBasketballOrder {

    /**
     * 订购商名称
     */
    void value();

    /**
     * 篮球订购
     *
     * @param name 品牌
     */
    void order(String name);
}
