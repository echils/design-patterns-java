package com.github.pattern.commond;

import com.github.pattern.commond.light.Light;
import com.github.pattern.commond.light.LightOffCommand;
import com.github.pattern.commond.light.LightOnCommand;
import com.github.pattern.commond.tv.TV;
import com.github.pattern.commond.tv.TvOffCommand;
import com.github.pattern.commond.tv.TvOnCommand;
import org.junit.jupiter.api.Test;

/**
 * 命令模式测试类
 *
 * @author echils
 */
public class CommandTest {

    /*
        介绍：
             1）命令模式在软件设计中，我们经常需要向某些对象发送请求，但是并不知道请求的接收者是谁，也不知道被请求的操作是哪个
             2）命令模式使得请求发送者与请求接收者消除彼此之间的耦合，让对象之间的调用关系更加灵活，实现解耦
             3）在命令模式中，会将一个请求封装为一个对象，以便使用不同参数来表示不同的请求，同时命令模式也支持可撤销的操作
             4）命令模式的角色和职责：
                Invoker: 调用者角色
                Command: 命令角色，需要执行的所有命令都在这里，可以是抽象类或者接口
                Receiver:接收者角色，知道如何实施和执行一个请求相关的操作
                ConcreteCommand: 具体的命令实现，将一个接收者对象与一个动作绑定，调用接收者相应的操作，实现命令的执行
        细节：
             1）将发起请求的对象与执行请求的对象解耦，发起请求的对象是调用者，调用者只要调用命令对象的执行方法就可以让接收者工作，而不必
                知道具体的接收者对象是谁，是如何实现的，命令对象会负责让接收者执行请求的动作。也就是说：请求发起者和请求执行者之间的解耦
                是通过命令对象实现的，命令对象起到了纽带桥梁的作用
             2）设计一个命令队列，只要把命令对象放到队列，就可以多线程的执行命令
             3）实现对请求的撤销和重做
             4）不足：可能导致某些系统有过多的具体命令类，增加了系统的复杂度。
             5）空命令也是一种设计模式，它为我们省去了判空的操作
     */


    /**
     * 命令模式
     * 每一种命令聚合接收者
     * 命令调用者不用关心谁去执行命令
     */
    @Test
    public void test() {

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
