package com.github.pattern.state;

/**
 * 提交抽奖券状态
 *
 * @author echils
 */
public class SubmitTicketState implements State {

    private Activity activity;

    public SubmitTicketState(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void submitTicket() {
        System.out.println("已提交抽奖券，可以开始抽奖");
        activity.setState(activity.getRaffleState());
    }

    @Override
    public void raffle() {
        System.out.println("请出示你的抽奖券");
    }

    @Override
    public void display() {
        System.out.println("不能发放奖品");
    }
}
