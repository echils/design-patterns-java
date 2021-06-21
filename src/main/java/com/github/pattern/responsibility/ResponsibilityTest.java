package com.github.pattern.responsibility;

import org.junit.jupiter.api.Test;

/**
 * 责任链模式测试类
 *
 * @author echils
 */
public class ResponsibilityTest {

    /*
        介绍：
             1）责任链模式为请求创建了一个接收者对象的链，将请求的发送者和接收者进行解耦
             2）责任链模式通常每个接收者都包含对另一个接收者的引用。如果一个对象不能处理该对象，那么它会把相同的请求传给下一个接收者，以此类推
             3）角色和职责：
                1、Handler: 抽象的处理者，定义了一个处理请求的接口，同时包含一个另外的Handler
                2、ConcreteHandler: 具体的处理者，处理自己负责的请求，可以访问它的下一个处理者，
                3、Request: 请求
        细节：
             1）将请求和处理分开，实现解耦，提高系统的灵活性
             2）简化了请求，使请求不需要知道链的结构
             3）最佳应用场景： 多个对象可以处理同一个请求时，比如：多级请求，各种审批流程
     */

    @Test
    public void test() {
        PurchaseRequest request = new PurchaseRequest(800);
        Handler handler = new GroupLeader("张三");
        handler.setNextHandler(new DepartmentLeader("李四"));
        handler.handleRequest(request);
    }

}
