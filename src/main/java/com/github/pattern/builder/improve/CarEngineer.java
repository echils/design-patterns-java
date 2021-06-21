package com.github.pattern.builder.improve;

/**
 * 车制造过程管理者（工程师）
 *
 * @author echils
 */
public class CarEngineer {

    private ICarBuilder builder;

    public CarEngineer(ICarBuilder builder) {
        this.builder = builder;
    }

    public Car build() {
        builder.buildBody();
        builder.buildTire();
        builder.buildEngine();
        return builder.provide();
    }
}
