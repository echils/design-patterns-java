package com.github.pattern.responsibility;

/**
 * 抽象处理者
 *
 * @author echils
 * @since 2020-01-18 15:22:19
 */
public abstract class Handler {

    /**
     * 处理者姓名
     */
    String name;

    /**
     * 下一个处理者
     */
    Handler nextHandler;

    /**
     * 抽象处理方法
     */
    public abstract void handleRequest(PurchaseRequest request);


    public Handler(String name) {
        this.name = name;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }


}
