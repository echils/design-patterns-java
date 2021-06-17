package com.github.pattern.commond.tv;

import com.github.pattern.commond.ICommandReceiver;

/**
 * 电视
 *
 * @author echils
 * @since 2020-01-01 21:25:55
 */
public class TV implements ICommandReceiver {

    @Override
    public void on() {
        System.out.println("打开电视");
    }

    @Override
    public void off() {
        System.out.println("关闭电视");
    }

}
