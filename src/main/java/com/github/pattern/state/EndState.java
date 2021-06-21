package com.github.pattern.state;

/**
 * 抽奖活动结束状态
 *
 * @author echils
 */
public class EndState implements State {

    private Activity activity;

    public EndState(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void submitTicket() {
        System.out.println("活动[" + activity.getName() + "]结束，票已作废");
    }

    @Override
    public void raffle() {
        System.out.println("活动[" + activity.getName() + "]结束，票已作废");
    }

    @Override
    public void display() {
        System.out.println("活动[" + activity.getName() + "]结束，票已作废");
    }

}
