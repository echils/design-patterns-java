package com.github.pattern.responsibility;

/**
 * FirstHandler
 *
 * @author echils
 * @since 2020-01-18 15:32:28
 */
public class FirstHandler extends Handler {

    public FirstHandler(String name) {
        super(name);
    }

    @Override
    public void handle(PurchaseRequest request) {
        if (request.getPrice() < 500) {
            System.out.println("first handler handle");
        } else {
            handler.handle(request);
        }
    }
}
