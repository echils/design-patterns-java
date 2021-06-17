package com.github.pattern.state;

/**
 * StateClient
 *
 * @author echils
 * @since 2020-01-18 13:49:55
 */
public class StateClient {


    public static void main(String[] args) {

        Activity activity = new Activity(5);

        for (int i = 0; i < 20; i++) {
            System.out.println("===========第" + i + "位抽奖者===========");
            activity.submitTicket();
            activity.startToFaffle();
            activity.dispaly();
        }
    }
}
