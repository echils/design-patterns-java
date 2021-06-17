package com.github.pattern.composite;

import org.junit.jupiter.api.Test;

/**
 * 组合模式测试类
 *
 * @author echils
 * @since 2020-01-01 22:02:15
 */
public class CompositeTest {


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
