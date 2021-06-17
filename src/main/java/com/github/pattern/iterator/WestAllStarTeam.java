package com.github.pattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 西部全明星队
 *
 * @author echils
 * @since 2020-01-05 21:22:42
 */
public class WestAllStarTeam implements IAllStarTeam {

    private List<Player> players;

    public WestAllStarTeam() {
        players = new ArrayList<>();
        addPlayer("库里");
        addPlayer("科比");
        addPlayer("杜兰特");
        addPlayer("邓肯");
        addPlayer("奥尼尔");
    }

    @Override
    public String getTeamName() {
        return "西部全明星队";
    }

    @Override
    public void addPlayer(String playerName) {
        players.add(new Player(playerName));
    }

    @Override
    public Iterator createIterator() {
        return new WestAllStarIterator(players);
    }
}
