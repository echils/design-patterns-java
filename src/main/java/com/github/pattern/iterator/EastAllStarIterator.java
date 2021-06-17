package com.github.pattern.iterator;

import java.util.Iterator;

/**
 * EastAllStarIterator
 *
 * @author echils
 * @since 2020-01-05 20:53:26
 */
public class EastAllStarIterator implements Iterator {

    private Player[] players;

    private int position = 0;

    public EastAllStarIterator(Player[] players) {
        this.players = players;
    }

    @Override
    public boolean hasNext() {
        return position < players.length && players[position] != null;
    }

    @Override
    public Player next() {
        Player player = players[position];
        position++;
        return player;
    }
}
