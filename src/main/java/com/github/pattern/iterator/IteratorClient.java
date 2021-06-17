package com.github.pattern.iterator;

import java.util.Iterator;

/**
 * 迭代器模式测试类
 *
 * @author echils
 * @since 2020-01-05 21:35:31
 */
public class IteratorClient {

    public static void main(String[] args) {
        introduce(new WestAllStarTeam());
        introduce(new EastAllStarTeam());
    }

    private static void introduce(IAllStarTeam allStarTeam) {
        System.out.println(allStarTeam.getTeamName() + ":");
        Iterator<Player> iterator = allStarTeam.createIterator();
        while (iterator.hasNext()) {
            System.out.println((iterator.next().getName()));
        }
    }
}
