package com.github.pattern.mediator;

/**
 * 用户
 *
 * @author echils
 * @since 2020-01-08 22:56:52
 */
public class User {

    private String name;

    private Mediator mediator;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void joinMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public Mediator createMediator() {
        ConcreteMediator concreteMediator = new ConcreteMediator();
        this.mediator = concreteMediator;
        concreteMediator.register(this);
        return concreteMediator;
    }

    public void sendMsg(String msg) {
        if (mediator != null) {
            mediator.sendMsg(this, msg);
        } else {
            System.out.println("你还没加入直播间");
        }
    }

}
