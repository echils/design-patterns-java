package com.github.pattern.observer;

/**
 * 数据中心抽象类
 *
 * @author echils
 */
public interface Info {

    void register(Observer observer);

    void remove(Observer observer);

    void notifyInfo();

}
