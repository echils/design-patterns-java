package com.github.pattern.observer;

import org.junit.jupiter.api.Test;

/**
 * 观察者模式测试类
 *
 * @author echils
 * @since 2020-01-05 22:30:02
 */
public class ObserverTest {

    /*
        介绍：
             1）定义了对象之间的一对多依赖，当一个对象状态改变时，其他依赖者都会收到通知
             2) JDK自带Observable、Observer，既支持主动推，也支持观察者自己拉取信息，而且setChanged()方法给更新条件提供了更多的灵活性，
                但是缺点就是要想使用JDK自带的观察者模式，必须继承Observable,但由于Java只支持单继承，那么就有一定的局限性
     */

    @Test
    public void test() {

        WeatherInfo weatherInfo = new WeatherInfo();

        WebObserver webObserver = new WebObserver();
        weatherInfo.register(webObserver);
        weatherInfo.setWeather("晴");

        System.out.println("=======================");
        weatherInfo.register(new AppObserver());
        weatherInfo.setWeather("小雨");

        System.out.println("=======================");
        weatherInfo.remove(webObserver);
        weatherInfo.setWeather("阴");

    }

}
