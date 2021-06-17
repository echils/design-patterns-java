package com.github.pattern.responsibility;

/**
 * Handler
 *
 * @author echils
 * @since 2020-01-18 15:22:19
 */
public abstract class Handler {

    String name;

    Handler handler;

    public Handler(String name) {
        this.name = name;
    }

    public void setNextHanler(Handler hanler) {
        this.handler = hanler;
    }

    public abstract void handle(PurchaseRequest request);

}
