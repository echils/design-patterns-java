package com.github.pattern.commond;

/**
 * 命令定义
 *
 * @author echils
 */
public interface ICommand {

    /**
     * 命令执行操作
     */
    void execute();


    /**
     * 命令的取消
     */
    void cancel();
}
