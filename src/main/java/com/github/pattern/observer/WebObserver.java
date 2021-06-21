package com.github.pattern.observer;

/**
 * 具体的观察实现类（网页）
 *
 * @author echils
 */
public class WebObserver implements Observer {

    @Override
    public void update(String weather) {
        System.out.println("网页天气预报接到更新通知,当前天气：" + weather);
    }
}
