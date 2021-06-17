package com.github.pattern.adapter.springadapter;

/**
 * 手机处理器
 *
 * @author echils
 * @since 2019-06-17 11:48:09
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
