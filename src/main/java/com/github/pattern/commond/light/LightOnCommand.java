package com.github.pattern.commond.light;

import com.github.pattern.commond.ICommand;

/**
 * 开灯命令
 *
 * @author echils
 * @since 2020-01-01 20:58:17
 */
public class LightOnCommand implements ICommand {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void cancel() {
        light.off();
    }
}
