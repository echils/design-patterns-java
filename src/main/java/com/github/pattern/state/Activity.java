package com.github.pattern.state;

/**
 * Activity
 *
 * @author echils
 * @since 2020-01-18 12:24:44
 */
public class Activity {

    private int count;

    private State state;

    private NotHasAwardState notHasAwardState = new NotHasAwardState(this);

    private SubmitTicketState submitTicketState = new SubmitTicketState(this);

    private RaffleState raffleState = new RaffleState(this);

    private DisplayState displayState = new DisplayState(this);

    private NotDisplayState notDisplayState = new NotDisplayState(this);

    public Activity(int count) {
        if (count <= 0) {
            throw new RuntimeException("必须有奖品，否则活动没办法办");
        }
        this.count = count;
        this.state = submitTicketState;
    }

    public void submitTicket() {
        state.submitTicket();
    }

    public void startToFaffle() {
        state.raffle();
    }

    public void dispaly() {
        state.display();
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setState(State state) {
        this.state = state;
    }

    public SubmitTicketState getSubmitTicketState() {
        return submitTicketState;
    }

    public RaffleState getRaffleState() {
        return raffleState;
    }

    public DisplayState getDisplayState() {
        return displayState;
    }

    public NotDisplayState getNotDisplayState() {
        return notDisplayState;
    }

    public NotHasAwardState getNotHasAwardState() {
        return notHasAwardState;
    }
}
