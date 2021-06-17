package com.github.pattern.facade;

/**
 * 家庭影院定义
 *
 * @author echils
 * @since 2020-01-02 20:06:15
 */
public class HomeFacade {

    private Video video;
    private Light light;
    private Stereo stereo;
    private Projector projector;
    private ProjectorScreen projectorScreen;

    public HomeFacade() {
        this.video = Video.getInstance();
        this.light = Light.getInstance();
        this.stereo = Stereo.getInstance();
        this.projector = Projector.getInstance();
        this.projectorScreen = ProjectorScreen.getInstance();
    }

    public void ready() {
        projectorScreen.down();
        projector.open();
        stereo.open();
        stereo.adjust();
        light.close();
        System.out.println();
    }

    public void start() {
        video.play();
        System.out.println();
    }


    public void end() {
        video.close();
        System.out.println();
    }


    public void restore() {
        light.open();
        stereo.close();
        projector.close();
        projectorScreen.up();
    }

}
