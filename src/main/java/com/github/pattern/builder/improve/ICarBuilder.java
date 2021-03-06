package com.github.pattern.builder.improve;

/**
 * 抽象建造者
 *
 * @author echils
 */
public interface ICarBuilder {

    void buildBody();

    void buildTire();

    void buildEngine();

    Car provide();
}
