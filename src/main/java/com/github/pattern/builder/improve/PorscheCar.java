package com.github.pattern.builder.improve;

/**
 * 保时捷建造者
 *
 * @author echils
 * @since 2019-06-19 22:54:41
 */
public class PorscheCar implements ICarBuilder {

    private Car car = new Car();

    @Override
    public void buildBody() {
        car.setBody("生产保时捷车身");
    }

    @Override
    public void buildTire() {
        car.setTire("生产保时捷轮胎");
    }

    @Override
    public void buildEngine() {
        car.setEngine("生产保时捷引擎");
    }

    @Override
    public Car provide() {
        return car;
    }
}
