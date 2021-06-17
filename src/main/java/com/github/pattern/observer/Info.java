package com.github.pattern.observer;

/**
 * 数据中心抽象类
 *
 * @author echils
 * @since 2020-01-05 22:22:57
 */
public interface Info {

    void register(Observer observer);

    void remove(Observer observer);

    void notifyInfo();

}
