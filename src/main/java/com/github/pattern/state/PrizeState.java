package com.github.pattern.state;


/**
 * 中奖状态
 *
 * @author echils
 * @since 2020-01-18 12:23:20
 */
public class PrizeState implements State {

    private Activity activity;

    public PrizeState(Activity activity) {
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
        int count = activity.getCount();
        count -= 1;
        if (count == 0) {
            activity.setState(activity.getEndState());
        } else {
            activity.setState(activity.getSubmitTicketState());
        }
        activity.setCount(count);
        System.out.println("恭喜你，这是你的奖品");
    }
}
