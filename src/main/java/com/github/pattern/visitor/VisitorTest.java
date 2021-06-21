package com.github.pattern.visitor;

import org.junit.jupiter.api.Test;

/**
 * 访问者模式测试类
 *
 * @author echils
 */
public class VisitorTest {

    /*
        介绍：
             1）访问者模式封装一些作用于某种数据结构的各元素的操作，它可以在不改变数据结构的前提下定义作用于这些元素的新操作
             2）主要将数据结构与数据操作分离，解决数据结构和操作耦合性问题
             3）访问者模式的基本工作原理是：在被访问的类里面加一个对外提供接待访问者的接口
             4）访问者模式应用场景：需要对一个比较稳定的数据结构的对象进行很多不同操作（这些操作彼此没有关联）同时需要避免让这些操作“污染”这些
                对象的类，此需求下推荐使用访问者模式解决
             5）主要角色及职责
                Visitor: 抽象访问者，为对象结构中的ConcreteElement的每一个类声明visit操作
                ConcreteVisitor: 具体访问者，实现自定义的visit操作
                ObjectStructure: 能够枚举它的所有元素，并提供一个接口，用来访问允许访问者访问元素
                Element: 抽象元素，定义一个accept方法，接收一个访问者对象
                ConcreteElement:具体的元素，实现accept方法
             6）双分派：不管类怎么变化，我们都能找到期望的方法运行，双分派意味着得到执行的操作取决于请求的种类和两个接收者额类型
        细节：
             优点：
             1）访问者模式符合单一职责原则，让程序具有优秀的拓展性、灵活性非常高
             2）访问者模式可以对功能进行统一’可以做报表、拦截器与过滤器，适用于数据结构相对稳定的系统
             缺点：
             1）具体元素对访问者公布细节，也就是说访问者关注了其他类的内部细节，这是迪米特法则所不建议的
             2）违背了依赖倒转原则，访问者依赖的是具体元素，而不是抽象元素
     */

    @Test
    public void test() {

        Report report = new Report();
        report.attach(new VisitorA("大众用户"));
        report.attach(new VisitorB("专业测评"));

        AppB appB = new AppB("智能运检系统");
        report.measure(appB);

        System.out.println("--------------");

        AppA appA = new AppA("海康系统");
        report.measure(appA);
    }

}
