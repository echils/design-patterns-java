package com.github.pattern.facade;

/**
 * 幕布
 *
 * @author echils
 * @since 2020-01-02 20:02:15
 */
public class ProjectorScreen {

    private static ProjectorScreen projectorScreen = new ProjectorScreen();

    private ProjectorScreen() {
    }

    public static ProjectorScreen getInstance() {
        return projectorScreen;
    }

    public void up() {
        System.out.println("用投影仪幕布遥控器将幕布收起来");
    }

    public void down() {
        System.out.println("用投影仪幕布遥控器将幕布降下来");
    }

}
