package com.github.pattern.responsibility;

/**
 * 部门领导
 *
 * @author echils
 * @since 2020-01-18 15:32:28
 */
public class DepartmentLeader extends Handler {

    public DepartmentLeader(String name) {
        super(name);
    }

    @Override
    public void handleRequest(PurchaseRequest request) {
        if (request.getPrice() < 1000) {
            System.out.println("大于500小于1000的部门领导[" + name + "]可以审批");
        } else {
            System.out.println("审批不通过");
        }
    }
}
