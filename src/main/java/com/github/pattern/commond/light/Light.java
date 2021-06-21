package com.github.pattern.commond.light;

import com.github.pattern.commond.ICommandReceiver;

/**
 * 灯光
 *
 * @author echils
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
