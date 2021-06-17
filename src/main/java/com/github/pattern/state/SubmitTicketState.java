package com.github.pattern.state;


/**
 * SubmitTicketState
 *
 * @author echils
 * @since 2020-01-18 12:23:20
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
