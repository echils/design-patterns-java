package com.github.pattern.state;


/**
 * 没有中奖状态
 *
 * @author echils
 * @since 2020-01-18 12:23:20
 */
public class NotPrizeState implements State {

    private Activity activity;

    public NotPrizeState(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void submitTicket() {
        System.out.println("中奖结果已发布，快去看看吧");
    }

    @Override
    public void raffle() {
        System.out.println("中奖结果已发布，快去看看吧");
    }

    @Override
    public void display() {
        System.out.println("很遗憾，你没有中奖");
        activity.setState(activity.getSubmitTicketState());
    }
}
