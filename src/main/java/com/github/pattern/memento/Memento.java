package com.github.pattern.memento;

/**
 * 存档内容
 *
 * @author echils
 */
public class Memento {

    /**
     * 等级
     */
    protected int level;


    /**
     * 攻击力
     */
    protected int damage;


    /**
     * 防御能力
     */
    protected int defense;


    public Memento(int level, int damage, int defense) {
        this.level = level;
        this.damage = damage;
        this.defense = defense;
    }

    public int getLevel() {
        return level;
    }

    public int getDamage() {
        return damage;
    }

    public int getDefense() {
        return defense;
    }
}
