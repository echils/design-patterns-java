package com.github.pattern.state;


/**
 * DisplayState
 *
 * @author echils
 * @since 2020-01-18 12:23:20
 */
public class DisplayState implements State {

    private Activity activity;


    public DisplayState(Activity activity) {
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
            activity.setState(activity.getNotHasAwardState());
        } else {
            activity.setState(activity.getSubmitTicketState());
        }
        activity.setCount(count);
        System.out.println("恭喜你，这是你的奖品");
    }
}
