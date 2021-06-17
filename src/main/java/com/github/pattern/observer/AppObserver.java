package com.github.pattern.observer;

/**
 * 具体的观察实现类（手机应用）
 *
 * @author echils
 * @since 2020-01-05 22:29:18
 */
public class AppObserver implements Observer {

    @Override
    public void update(String weather) {
        System.out.println("手机天气预报接到更新通知,当前天气：" + weather);
    }

}
