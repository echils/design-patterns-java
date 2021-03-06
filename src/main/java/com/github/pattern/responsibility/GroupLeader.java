package com.github.pattern.responsibility;

/**
 * 组长
 *
 * @author echils
 */
public class GroupLeader extends Handler {

    public GroupLeader(String name) {
        super(name);
    }

    @Override
    public void handleRequest(PurchaseRequest request) {
        if (request.getPrice() < 500) {
            System.out.println("小于500的金额，组长[" + name + "]可以审批");
        } else {
            nextHandler.handleRequest(request);
        }
    }
}
