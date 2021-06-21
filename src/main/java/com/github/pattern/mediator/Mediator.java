package com.github.pattern.mediator;

/**
 * 抽象中介类
 *
 * @author echils
 */
public interface Mediator {

    void register(User user);

    void sendMsg(User user, String msg);
}
