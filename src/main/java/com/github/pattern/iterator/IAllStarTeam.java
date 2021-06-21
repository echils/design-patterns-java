package com.github.pattern.iterator;

import java.util.Iterator;

/**
 * 全明星队伍
 *
 * @author echils
 */
public interface IAllStarTeam {

    String getTeamName();

    void addPlayer(String playerName);

    Iterator createIterator();
}
