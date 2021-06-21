package com.github.pattern.adapter.springadapter;

/**
 * 电脑处理器
 *
 * @author echils
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
