package com.github.pattern.mediator;

/**
 * 抽象中介类
 *
 * @author echils
 * @since 2020-01-08 22:55:57
 */
public interface Mediator {

    void register(User user);

    void sendMsg(User user, String msg);
}
