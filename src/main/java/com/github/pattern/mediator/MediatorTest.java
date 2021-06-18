package com.github.pattern.mediator;

import org.junit.jupiter.api.Test;

/**
 * 中介模式测试类
 *
 * @author echils
 * @since 2020-01-09 23:41:20
 */
public class MediatorTest {

    /*
        介绍：
             1）中介者模式用一个中介对象来封装一系列的对象交互。中介者使各个对象不需要显式地相互引用，从而使其耦合松散，而且可以独立地改变它们之间的交互
             2）常见的中介者模式应用，MVC模式，C是M和V的中介者，在前后端交互时起到了中间人的作用
             3）主要角色和职责：
                1）Mediator: 抽象中介者，定义了同事对象到中介者对象的接口
                2）Colleague: 抽象同事类
                3）ConcreteMediator: 具体的中介者对象，实现抽象方法，他需要知道所有的具体的同事类，即以一个集合来管理,
                  并接受某个同事对象消息，完成相应的任务
                4）ConcreteColleague: 具体的同事类，会有若干个。每个同事只知道自己的行为，而不了解其他同事类的行为方法，但是它们都依赖中介者对象
        细节：
             1）多个类相互耦合，会形成网状结构，使用中介者模式将网状结构分类为星型结构，进行解耦
             2）减少类间依赖，降低了耦合，符合迪米特原则
             3）中介者承担了较多的责任，一旦中介者出现了问题，那个系统就会受到影响
             4）如果设计不当，中介者独享本会会变得过于复杂，这点在实际使用时，要特别注意
             5) 中介者在整个系统中主要承担两个方面的责任
                A:结构上起到中转作用。通过中介者对象对关系的封装，使得具体的同事类不再需要显示的引用其他对象，它只需要通过中介者就可以完成与其他同事类之间的通信
                B:行为上起到协作作用。中介者对同事类之间的关系进行封装，同事类在不需要知道其他对象的情况下通过中介者与其他对象完成通信。
                  在这个过程中同事类是不需要指明中介者该如何做，中介者可以根据自身的逻辑来进行协调，对同事的请求进一步处理，将同事成员之间的关系行为进行分离和封装
     */

    @Test
    public void test() {
        User user1 = new User("主播");
        Mediator mediator = user1.createMediator();
        user1.sendMsg("大家好");

        User user2 = new User("观众甲");
        user2.joinMediator(mediator);
        user2.sendMsg("主播好");

        User user3 = new User("观众乙");
        user3.joinMediator(mediator);
        user3.sendMsg("下午好");
    }

}
