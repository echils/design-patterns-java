package com.github.pattern.proxy.dynamic;

import java.lang.reflect.Proxy;

/**
 * 动态代理
 *
 * @author echils
 * @since 2020-01-05 22:30:02
 */
public class PersonDynamicProxy {

    private IPerson person;

    public PersonDynamicProxy(IPerson person) {
        this.person = person;
    }

    public Object getProxyInstance() {
        return Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(), (o, m, p) -> {
            System.out.println("搞搞价");
            Object result = m.invoke(person, p);
            System.out.println("产品评价");
            return result;
        });
    }
}
