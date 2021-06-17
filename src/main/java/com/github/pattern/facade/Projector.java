package com.github.pattern.facade;

/**
 * 投影仪
 *
 * @author echils
 * @since 2020-01-02 20:02:15
 */
public class Projector {

    private static Projector projector = new Projector();

    private Projector() {
    }

    public static Projector getInstance() {
        return projector;
    }

    public void open() {
        System.out.println("用投影仪遥控器将投影仪打开");
    }

    public void close() {
        System.out.println("用投影仪遥控器将投影仪关闭");
    }

}
