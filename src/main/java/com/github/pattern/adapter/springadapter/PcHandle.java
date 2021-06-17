package com.github.pattern.adapter.springadapter;

/**
 * 电脑处理器
 *
 * @author echils
 * @since 2019-06-17 11:48:01
 */
public class PcHandle implements Handle {
    @Override
    public String support() {
        return "PC";
    }

    @Override
    public void handle() {
        System.out.println("处理电脑");
    }
}
