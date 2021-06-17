package com.github.pattern.mediator;

/**
 * 中介模式测试类
 *
 * @author echils
 * @since 2020-01-09 23:41:20
 */
public class MediatorClient {

    public static void main(String[] args) {

        User user1 = new User("主播");
        Mediator mediator = user1.createMediator();
        user1.sendMsg("大家好");

        User user2 = new User("观众甲");
        user2.joinMediator(mediator);
        user2.sendMsg("主播好");

        User user3 = new User("观众乙");
        user3.joinMediator(mediator);
        user3.sendMsg("下午好");


    }
}
