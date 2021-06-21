package com.github.pattern.memento;

import org.junit.jupiter.api.Test;

/**
 * 备忘录模式测试类
 *
 * @author echils
 */
public class MementoTest {

    /*
        介绍：
             1）备忘录模式在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态，这样以后就可将该对象恢复到原先保存的状态
             2) 备忘录对象主要用来记录一个对象的某种状态，或者某些数据，当要做回退时，可以从备忘录对象里获取原来的数据进行恢复操作
             3）角色和职责：
                1）Originator: 需要保存状态的对象
                2）Memento: 备忘录对象，负责保存好记录
                3）Caretaker: 守护者对象，负责保存多个备忘录对象，使用集合管理，提高效率
                4）说明：如果希望保存多个Originator对象的不同时间的状态，也可以，只需要HashMap<String,集合>
        细节：
             1）给用户提供了一种可以恢复状态的机制，可以使用户能够比较方便地回到某个历史的状态
             2）实现了信息的封装，使得用户不需要关心状态的保存细节
             3）如果类的成员变量过多，势必会占用比较大的资源，而且每一次保存都会消耗一定的内存，这个需要注意
             4）使用的应用场景： 1、后悔药 2、游戏存档 3、系统或者工具的Ctrl+Z的撤销操作 4数据的事物管理
             5）为了节约内存，备忘录模式可以喝原型模式配合使用
     */

    @Test
    public void test() {

        Caretaker caretaker = new Caretaker();

        System.out.println("创建新文档，选择英雄曹操");
        GamePlayer player = new GamePlayer("曹操", 1, 93, 95);
        player.show();

        System.out.println("曹操完成任务，等级升级");
        player.setLevel(2);
        player.show();

        System.out.println("游戏存档...");
        caretaker.addMemento(player.getId(), player.save());

        System.out.println("曹操刺杀董卓");
        System.out.println("曹操被发现，被董卓追杀");
        System.out.println("曹操饥寒交迫");
        player.setDamage(60);
        player.setDefense(57);
        player.show();

        System.out.println("董卓追来了，击杀了曹操，游戏结束");
        System.out.println("读取存档...");
        player.read(caretaker.getMemento("曹操", 0));
        player.show();
    }

}
