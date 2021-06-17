package com.github.pattern.facade;

/**
 * 音响
 *
 * @author echils
 * @since 2020-01-02 20:02:15
 */
public class Stereo {

    private static Stereo stereo = new Stereo();

    private Stereo() {
    }

    public static Stereo getInstance() {
        return stereo;
    }

    public void open() {
        System.out.println("用音响遥控器打开音响");
    }

    public void adjust() {
        System.out.println("用音响遥控器调节音量");
    }

    public void close() {
        System.out.println("用音响遥控器关闭音响");
    }

}
