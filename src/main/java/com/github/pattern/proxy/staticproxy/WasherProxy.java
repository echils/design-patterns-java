package com.github.pattern.proxy.staticproxy;

/**
 * 静态代理： 同样实现IWasher
 *
 * @author echils
 * @since 2020-01-05 22:30:02
 */
public class WasherProxy implements IWasher {

    private IWasher washer;

    public WasherProxy(IWasher washer) {
        this.washer = washer;
    }

    @Override
    public void wash() {
        System.out.println("添加洗衣液");
        if (washer != null) {
            washer.wash();
        }
        System.out.println("甩干");
    }
}
