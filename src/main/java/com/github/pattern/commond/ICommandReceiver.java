package com.github.pattern.commond;

/**
 * 命令接受者定义
 *
 * @author echils
 * @since 2020-01-01 20:55:40
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
