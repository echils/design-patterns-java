package com.github.pattern.builder.improve;

/**
 * 抽象建造者
 *
 * @author echils
 * @since 2019-06-19 22:54:52
 */
public interface ICarBuilder {

    void buildBody();

    void buildTire();

    void buildEngine();

    Car provide();
}
