package com.github.pattern.commond.light;

import com.github.pattern.commond.ICommand;

/**
 * 开灯命令
 *
 * @author echils
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
