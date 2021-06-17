package com.github.pattern.memento;

/**
 * 备忘录模式测试类
 *
 * @author echils
 * @since 2020-01-12 22:02:03
 */
public class MementoClient {

    public static void main(String[] args) {

        Caretaker caretaker = new Caretaker();

        System.out.println("创建新文档，选择英雄曹操");
        GamePlayer caocao = new GamePlayer("曹操", 1, 93, 95);
        caocao.show();

        System.out.println("曹操完成任务，等级升级");
        caocao.setLevel(2);
        caocao.show();

        System.out.println("游戏存档...");
        caretaker.addMemento(caocao.getId(), caocao.save());

        System.out.println("曹操刺杀董卓");
        System.out.println("曹操被发现，被董卓追杀");
        System.out.println("曹操饥寒交迫");
        caocao.setDamage(60);
        caocao.setDefense(57);
        caocao.show();

        System.out.println("董卓追来了，击杀了曹操，游戏结束");
        System.out.println("读取存档...");
        caocao.read(caretaker.getMemento("曹操", 0));
        caocao.show();
    }
}
