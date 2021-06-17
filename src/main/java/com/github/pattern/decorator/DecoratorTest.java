package com.github.pattern.decorator;

import org.junit.jupiter.api.Test;

/**
 * 装饰器模式测试类
 *
 * @author echils
 * @since 2020-01-01 23:15:15
 */
public class DecoratorTest {

    @Test
    public void test() {
        Phone phone = new ApplePhone();
        phone.show();
        System.out.println("-----------");
        PhoneShell phoneShell = new PhoneShell(phone);
        phoneShell.show();
        System.out.println("-----------");
        PhoneFilm phoneFilm = new PhoneFilm(phoneShell);
        phoneFilm.show();
    }
}
