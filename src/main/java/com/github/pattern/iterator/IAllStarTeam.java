package com.github.pattern.iterator;

import java.util.Iterator;

/**
 * 全明星队伍
 *
 * @author echils
 * @since 2020-01-05 21:20:31
 */
public interface IAllStarTeam {

    String getTeamName();

    void addPlayer(String playerName);

    Iterator createIterator();
}
