package com.github.pattern.commond.light;

import com.github.pattern.commond.ICommandReceiver;

/**
 * 灯光
 *
 * @author echils
 * @since 2020-01-01 21:09:05
 */
public class Light implements ICommandReceiver {

    @Override
    public void on() {
        System.out.println("开灯");
    }

    @Override
    public void off() {
        System.out.println("关灯");
    }

}
