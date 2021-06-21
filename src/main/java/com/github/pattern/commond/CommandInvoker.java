package com.github.pattern.commond;

/**
 * 命令调用程序（遥控器）
 *
 * @author echils
 */
public class CommandInvoker {

    /**
     * 打开命令
     */
    private ICommand[] onCommands;

    /**
     * 关闭命令
     */
    private ICommand[] offCommands;

    /**
     * 撤销命令
     */
    private ICommand cancelCommand;

    public CommandInvoker() {
        int LENGTH = 3;
        onCommands = new ICommand[LENGTH];
        offCommands = new ICommand[LENGTH];

        //利用空命令进行初始化
        for (int i = 0; i < LENGTH; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    public void setCommands(int index, ICommand onCommand, ICommand offCommand) {
        if (index < onCommands.length && index < offCommands.length) {
            onCommands[index] = onCommand;
            offCommands[index] = offCommand;
        }
    }

    public void pressOn(int index) {
        if (index < onCommands.length) {
            onCommands[index].execute();
            cancelCommand = onCommands[index];
        }
    }

    public void pressOff(int index) {
        if (index < offCommands.length) {
            offCommands[index].execute();
            cancelCommand = offCommands[index];
        }
    }


    public void cancel() {
        cancelCommand.cancel();
    }


}
