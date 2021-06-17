package com.github.pattern.state;


/**
 * NotHasAwardState
 *
 * @author echils
 * @since 2020-01-18 12:23:20
 */
public class NotHasAwardState implements State {

    private Activity activity;

    public NotHasAwardState(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void submitTicket() {
        System.out.println("活动结束，票已作废");
    }

    @Override
    public void raffle() {
        System.out.println("活动已结束");
    }

    @Override
    public void display() {
        System.out.println("不能发放奖品");
    }
}
