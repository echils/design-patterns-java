package com.github.pattern.responsibility;

/**
 * SecondHandler
 *
 * @author echils
 * @since 2020-01-18 15:32:28
 */
public class SecondHandler extends Handler {

    public SecondHandler(String name) {
        super(name);
    }

    @Override
    public void handle(PurchaseRequest request) {
        if (request.getPrice() < 1000) {
            System.out.println("second handler handle");
        } else {
            System.out.println("不处理");
        }
    }
}
