package com.github.pattern.commond.light;

import com.github.pattern.commond.ICommand;

/**
 * 关灯命令
 *
 * @author echils
 * @since 2020-01-01 20:59:23
 */
public class LightOffCommand implements ICommand {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void cancel() {
        light.on();
    }
}
