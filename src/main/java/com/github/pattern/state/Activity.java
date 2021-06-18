package com.github.pattern.state;

/**
 * 抽奖活动实体类
 *
 * @author echils
 * @since 2020-01-18 12:24:44
 */
public class Activity {

    /**
     * 活动名称
     */
    private String name;

    /**
     * 奖品个数
     */
    private int count;

    /**
     * 初始状态
     */
    private State state;

    /**
     * 结束状态
     */
    private EndState endState = new EndState(this);

    /**
     * 提交抽奖券状态
     */
    private SubmitTicketState submitTicketState = new SubmitTicketState(this);

    /**
     * 抽奖状态
     */
    private RaffleState raffleState = new RaffleState(this);

    /**
     * 中奖状态
     */
    private PrizeState prizeState = new PrizeState(this);

    /**
     * 未中奖状态
     */
    private NotPrizeState notPrizeState = new NotPrizeState(this);

    public Activity(String name, int count) {
        if (count <= 0) {
            throw new RuntimeException("必须有奖品，否则活动没办法办");
        }
        this.count = count;
        this.name = name;
        this.state = submitTicketState;
    }

    /**
     * 提交抽奖券
     */
    public void submitTicket() {
        state.submitTicket();
    }

    /**
     * 开始抽奖
     */
    public void startToLuckyDraw() {
        state.raffle();
    }

    /**
     * 抽奖结果展示
     */
    public void display() {
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

    public PrizeState getPrizeState() {
        return prizeState;
    }

    public NotPrizeState getNotPrizeState() {
        return notPrizeState;
    }

    public EndState getEndState() {
        return endState;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
