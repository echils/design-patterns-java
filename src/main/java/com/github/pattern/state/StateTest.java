package com.github.pattern.state;

import org.junit.jupiter.api.Test;

/**
 * 状态模式测试类
 *
 * @author echils
 * @since 2020-01-18 13:49:55
 */
public class StateTest {

    /*
        介绍：
             1）状态模式：它主要用来解决对象在多种内部状态转换时，需要对外输出不同的行为的问题，状态和行为是一一对应的，状态之间可以相互转换
             2）当一个对象的内在状态改变时，允许改变其行为，这个对象看起来像是改变了其类
             3）当一个事件或者对象有很多种状态，状态之间会相互转换，对不同的状态要求有不同的行为的时候，可以考虑使用状态模式
        细节：
             1）代码有很强的可读性，状态模式将每个状态的行为封装到对应的一个类中
             2）方便维护。将容易产生问题的if-else语句删除了，如果把每个状态的行为都放到-个类中，每次调用方法时都要判断当前是什么状态，不但会
                产生很多if-else语句，而且容易出错。
             3）符合开闭原则，容易增删状态
     */

    @Test
    public void test() {

        Activity activity = new Activity("状态模式", 3);
        for (int i = 0; i < 10; i++) {
            System.out.println("===========第" + (i + 1) + "位抽奖者===========");
            activity.submitTicket();
            activity.startToLuckyDraw();
            activity.display();
        }
    }
}
