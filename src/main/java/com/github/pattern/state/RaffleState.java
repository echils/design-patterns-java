package com.github.pattern.state;


import java.util.Random;

/**
 * 抽奖进行中状态
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
            activity.setState(activity.getPrizeState());
        } else {
            activity.setState(activity.getNotPrizeState());
        }
        System.out.println("抽奖机指针开始转动，等待指针停止");
    }

    @Override
    public void display() {
        System.out.println("不能发放奖品");
    }
}
