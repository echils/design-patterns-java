package com.github.pattern.adapter.springadapter;

/**
 * 手机处理器
 *
 * @author echils
 */
public class PhoneHandle implements Handle {
    @Override
    public String support() {
        return "Phone";
    }

    @Override
    public void handle() {
        System.out.println("处理手机");
    }
}
