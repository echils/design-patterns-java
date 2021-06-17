package com.github.pattern.visitor;

/**
 * VisitorClient
 *
 * @author echils
 * @since 2020-01-02 23:45:58
 */
public class VisitorClient {

    public static void main(String[] args) {

        Report report = new Report();
        HikVisitor hikVisitor = new HikVisitor("海康参观人员");
        ElecVisitor elecVisitor = new ElecVisitor("国家电网参观人员");
        CommonVisitor commonVisitor = new CommonVisitor("大众用户");
        report.attach(hikVisitor);
        report.attach(elecVisitor);
        report.attach(commonVisitor);

        AseitSystem aseitSystem = new AseitSystem("智能运检系统");
        report.display(aseitSystem);
        System.out.println("--------------");
        HikvisionSystem hikvisionSystem = new HikvisionSystem("海康系统");
        report.display(hikvisionSystem);
    }

}
