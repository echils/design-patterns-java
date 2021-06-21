package com.github.pattern.commond;

/**
 * 命令接受者定义
 *
 * @author echils
 */
public interface ICommandReceiver {

    /**
     * 打开
     */
    void on();

    /**
     * 关闭
     */
    void off();
}
