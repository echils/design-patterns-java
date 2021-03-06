package com.github.pattern.state;

/**
 * 抽奖机状态定义
 *
 * @author echils
 */
public interface State {

    /**
     * 提交抽奖券
     */
    void submitTicket();

    /**
     * 抽奖
     */
    void raffle();


    /**
     * 抽奖结果展示
     */
    void display();

}
