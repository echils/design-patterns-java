package com.github.pattern.commond;

/**
 * 空命令模式也是一种设计模式，可用于初始化或者空处理
 *
 * @author echils
 */
public class NoCommand implements ICommand {

    @Override
    public void execute() {
        //do nothing at default
    }

    @Override
    public void cancel() {
        //do nothing at default
    }
}
