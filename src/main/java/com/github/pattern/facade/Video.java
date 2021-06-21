package com.github.pattern.facade;


/**
 * 视频
 *
 * @author echils
 */
public class Video {

    private static Video video = new Video();

    private Video() {
    }

    public static Video getInstance() {
        return video;
    }

    public void play() {
        System.out.println("用视频遥控器开始播放视频");
    }

    public void pause() {
        System.out.println("用视频遥控器暂停视频播放");
    }

    public void close() {
        System.out.println("用视频遥控器关闭视频");
    }
}
