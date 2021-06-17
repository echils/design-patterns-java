package com.github.pattern.state;


/**
 * NotDisplayState
 *
 * @author echils
 * @since 2020-01-18 12:23:20
 */
public class NotDisplayState implements State {

    private Activity activity;


    public NotDisplayState(Activity activity) {
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
