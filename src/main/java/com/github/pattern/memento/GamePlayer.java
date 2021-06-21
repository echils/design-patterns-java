package com.github.pattern.memento;

import lombok.Data;

/**
 * GamePlayer
 *
 * @author echils
 */
@Data
public class GamePlayer {

    /**
     * ID
     */
    protected String id;

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


    public GamePlayer(String id, int level, int damage, int defense) {
        this.id = id;
        this.level = level;
        this.damage = damage;
        this.defense = defense;
    }

    /**
     * 存档
     *
     * @return
     */
    public Memento save() {
        return new Memento(level, damage, defense);
    }

    /**
     * 读档
     *
     * @param memento
     */
    public void read(Memento memento) {
        this.level = memento.getLevel();
        this.damage = memento.getDamage();
        this.defense = memento.getDefense();
    }

    public void show() {
        System.out.print("我是" + id);
        System.out.println(",能力：" + this.toString());
    }

}
