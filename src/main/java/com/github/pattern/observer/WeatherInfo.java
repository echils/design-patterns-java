package com.github.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 天气预报中心
 *
 * @author echils
 * @since 2020-01-05 22:25:22
 */
public class WeatherInfo implements Info {

    private String weather;

    private List<Observer> observers;

    public WeatherInfo() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyInfo() {
        if (observers != null && observers.size() != 0) {
            observers.forEach(o -> o.update(weather));
        }
    }

    public void setWeather(String weather) {
        this.weather = weather;
        notifyInfo();
    }

}
