package com.github.pattern.state;


import java.util.Random;

/**
 * RaffleState
 *
 * @author echils
 * @since 2020-01-18 12:23:20
 */
public class RaffleState implements State {

    private Activity activity;


    public RaffleState(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void submitTicket() {
        System.out.println("已提交抽奖券，可以开始抽奖");
    }

    @Override
    public void raffle() {
        if (new Random().nextBoolean()) {
            activity.setState(activity.getDisplayState());
        } else {
            activity.setState(activity.getNotDisplayState());
        }
        System.out.println("谢谢抽奖，抽奖结果稍后公布");
    }

    @Override
    public void display() {
        System.out.println("不能发放奖品");
    }
}
