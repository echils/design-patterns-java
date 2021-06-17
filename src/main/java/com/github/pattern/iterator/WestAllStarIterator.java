package com.github.pattern.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * 西部全明星迭代器
 *
 * @author echils
 * @since 2020-01-05 20:53:26
 */
public class WestAllStarIterator implements Iterator {

    private List<Player> players;

    private int index = -1;

    public WestAllStarIterator(List<Player> players) {
        this.players = players;
    }

    @Override
    public boolean hasNext() {
        if (index < players.size() - 1) {
            index++;
            return true;
        }
        return false;
    }

    @Override
    public Player next() {
        return players.get(index);
    }
}
