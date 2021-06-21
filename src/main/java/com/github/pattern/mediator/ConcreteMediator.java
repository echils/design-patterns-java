package com.github.pattern.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * 具体中介类（直播间）
 *
 * @author echils
 */
public class ConcreteMediator implements Mediator {

    private Map<String, User> userMap = new HashMap<>();

    @Override
    public void register(User user) {
        if (userMap.containsKey(user.getName())) {
            userMap.put(user.getName(), user);
        }
    }

    @Override
    public void sendMsg(User user, String msg) {
        System.out.println(user.getName() + ":" + msg);
    }

}
