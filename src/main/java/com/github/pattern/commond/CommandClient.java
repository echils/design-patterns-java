package com.github.pattern.commond;

import com.github.pattern.commond.light.Light;
import com.github.pattern.commond.light.LightOffCommand;
import com.github.pattern.commond.light.LightOnCommand;
import com.github.pattern.commond.tv.TV;
import com.github.pattern.commond.tv.TvOffCommand;
import com.github.pattern.commond.tv.TvOnCommand;

/**
 * 命令模式测试类
 *
 * @author echils
 * @since 2020-01-01 21:02:11
 */
public class CommandClient {

    /**
     * 1、每一种命令聚合接收者
     * 2、命令调用者不用关心谁去执行命令
     *
     * @param args
     */
    public static void main(String[] args) {

        int TV_INDEX = 1;
        int LIGHT_INDEX = 0;

        //创建灯的命令接受者
        Light light = new Light();
        //创建灯的命令
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);


        //创建电视命令接收者
        TV tv = new TV();
        //创建电视的命令
        TvOnCommand tvOnCommand = new TvOnCommand(tv);
        TvOffCommand tvOffCommand = new TvOffCommand(tv);


        //创建命令调用者
        CommandInvoker invoker = new CommandInvoker();

        //命令配置
        invoker.setCommands(LIGHT_INDEX, lightOnCommand, lightOffCommand);
        invoker.setCommands(TV_INDEX, tvOnCommand, tvOffCommand);

        //调用命令测试
        invoker.pressOn(LIGHT_INDEX);
        invoker.pressOn(TV_INDEX);
        invoker.cancel();
        invoker.pressOff(LIGHT_INDEX);
        invoker.cancel();
    }
}
