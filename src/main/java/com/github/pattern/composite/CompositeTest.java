package com.github.pattern.composite;

import org.junit.jupiter.api.Test;

/**
 * 组合模式测试类
 *
 * @author echils
 */
public class CompositeTest {

    /*
        介绍：
             1）组合模式又叫部分整体模式，他创建了对象组的树形结构，将对象组合成树状结构以表示“整体-部分”的层次关系
             2）组合模式依据树形结构来组合对象，用来表示部分与整体层次
             3）组合模式属于结构型模式
             4）组合模式使得用户对单个对象和组合对象的访问具有一致性，即：组合能让客户以一致的方式处理个别对象以及组合对象
        细节：
             1）简化客户端操作。客户端只需要面对一致的对象而不用考虑整体部分或者节点、叶子的问题
             2）具有较强的扩展性，当我们要更改组合对象时，我们只需要调整内部的层次关系，客户端不用调整
             3）方便创建出复杂的层次结构。客户端不用理会组合里面的组成细节，容易添加节点或者叶子，从而创建出复杂的树形结构
             4）需要遍历组织机构，或者处理的对象具有树形结构时，非常适合使用组合模式
             5）要求较高的抽象性，如果节点和鸭子有很多差异性的话，比如很多方法和属性都不一样，不适合使用组合模式
             6）组合模式的角色及职责：
                component： 这是组合对象声明接口，在适当的情况下，实现所有类共有的接口默认行为，用于访问和管理component子部件，component可以是抽象类或者接口
                composite：非叶子节点，用于粗存子部件，在component接口中实现子部件的相关操作，比如添加、删除等
                leaf：叶子节点，也就是没有子节点的节点

     */

    @Test
    public void test() {

        University university = new University("河南科技大学");
        Campus campus1 = new Campus("王城校区");
        Campus campus2 = new Campus("九都校区");

        Department department1 = new Department("土木工程系");
        Department department2 = new Department("机械工程系");
        Department department3 = new Department("音乐系");
        Department department4 = new Department("设计系");

        campus1.add(department1);
        campus1.add(department2);

        campus2.add(department3);
        campus2.add(department4);

        university.add(campus1);
        university.add(campus2);

        university.show();
        System.out.println("-----------");
        campus1.show();
        System.out.println("-----------");
        campus2.show();
        System.out.println("-----------");

    }

}
