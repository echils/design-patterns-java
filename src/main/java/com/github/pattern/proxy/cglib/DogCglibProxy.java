package com.github.pattern.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * CGLIB 代理
 *
 * @author echils
 */
public class DogCglibProxy implements MethodInterceptor {

    private Object target;

    public DogCglibProxy(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        //初始化代理工具类
        Enhancer enhancer = new Enhancer();
        //设置代理父类
        enhancer.setSuperclass(target.getClass());
        //设置回调函数
        enhancer.setCallback(this);
        //创建代理对象
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("狗狗穿衣服");
        Object result = method.invoke(target, args);
        System.out.println("狗狗洗澡");
        return result;
    }
}
