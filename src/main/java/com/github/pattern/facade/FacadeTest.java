package com.github.pattern.facade;

import org.junit.jupiter.api.Test;

/**
 * 外观模式测试类
 *
 * @author echils
 * @since 2020-01-02 20:06:15
 */
public class FacadeTest {

    /*
        通过外观模式，我们不需要知道内部子系统之间如何互相调用的细节，我们只要知道我们通过外观类的四个方法可以看电影就可以了
        通常情况下，我们要一场电影需要如下步骤：
            1）投影仪幕布放下来
            2）打开投影仪
            3）打开音响
            4) 调整音量
            5）关灯
            6）播放视频
        观看玩之后需要如下步骤：
            1）关闭视频
            2）开灯
            3）关闭音响
            4）关闭投影仪
            5）升起幕布
     */
    @Test
    public void test() {
        HomeFacade homeFacade = new HomeFacade();
        homeFacade.ready();
        homeFacade.start();
        homeFacade.end();
        homeFacade.restore();
    }
}
