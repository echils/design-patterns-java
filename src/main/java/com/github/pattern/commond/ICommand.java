package com.github.pattern.commond;

/**
 * 命令定义
 *
 * @author echils
 * @since 2020-01-01 20:57:01
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
