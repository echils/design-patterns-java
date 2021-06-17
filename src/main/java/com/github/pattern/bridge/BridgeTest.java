package com.github.pattern.bridge;

import org.junit.jupiter.api.Test;

/**
 * 桥接模式测试类
 *
 * @author echils
 * @since 2019-06-18 18:48:11
 */
public class BridgeTest {

    /*
        利用桥接模式完成银行的转账
        优点： 利用桥接模式，当需要添加一种新的转账方式或者新的用户时，只需新增一个类就可以了，对其他代码无影响
     */
    @Test
    public void testImprove() {
        Bank bank = new InternetBank(new EnterpriseUser());
        bank.transfer();
        bank = new ATMBank(new IndividualUser());
        bank.transfer();
    }


}
