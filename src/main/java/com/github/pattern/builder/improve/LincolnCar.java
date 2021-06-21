package com.github.pattern.builder.improve;

/**
 * 林肯车建造者
 *
 * @author echils
 */
public class LincolnCar implements ICarBuilder {

    private Car car = new Car();

    @Override
    public void buildBody() {
        car.setBody("生产林肯车身");
    }

    @Override
    public void buildTire() {
        car.setTire("生产林肯轮胎");
    }

    @Override
    public void buildEngine() {
        car.setEngine("生产林肯引擎");
    }

    @Override
    public Car provide() {
        return car;
    }
}
