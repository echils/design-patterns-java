package com.github.pattern.observer;

/**
 * 观察者模式测试类
 *
 * @author echils
 * @since 2020-01-05 22:30:02
 */
public class ObserverClient {


    public static void main(String[] args) {

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
