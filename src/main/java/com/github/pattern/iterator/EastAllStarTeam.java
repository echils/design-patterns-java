package com.github.pattern.iterator;

import java.util.Iterator;

/**
 * 东部全明星队伍
 *
 * @author echils
 */
public class EastAllStarTeam implements IAllStarTeam {

    private Player[] players;

    private int position = 0;

    public EastAllStarTeam() {
        players = new Player[5];
        addPlayer("罗斯");
        addPlayer("韦德");
        addPlayer("詹姆斯");
        addPlayer("波什");
        addPlayer("霍华德");
    }

    @Override
    public String getTeamName() {
        return "东部全明星队";
    }

    @Override
    public void addPlayer(String playerName) {
        players[position] = new Player(playerName);
        position++;
    }

    @Override
    public Iterator createIterator() {
        return new EastAllStarIterator(players);
    }
}
