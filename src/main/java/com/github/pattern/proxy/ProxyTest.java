package com.github.pattern.proxy;

import com.github.pattern.proxy.cglib.Dog;
import com.github.pattern.proxy.cglib.DogCglibProxy;
import com.github.pattern.proxy.dynamic.IPerson;
import com.github.pattern.proxy.dynamic.PersonDynamicProxy;
import com.github.pattern.proxy.dynamic.Student;
import com.github.pattern.proxy.staticproxy.IWasher;
import com.github.pattern.proxy.staticproxy.WasherImpl;
import com.github.pattern.proxy.staticproxy.WasherProxy;
import org.junit.jupiter.api.Test;

/**
 * 代理模式测试类
 *
 * @author echils
 * @since 2020-01-05 22:30:02
 */
public class ProxyTest {

    /*
        静态代理方法：
        优点： 在不修改目标对象的功能前提下，通过代理对象对目标功能进行拓展
        缺点： 因为静态代理对象与目标对象要实现一样的接口，所以会有很多代理类，
              一旦接口增加方法，目标对象与代理对象都要重新维护
     */
    @Test
    public void testStaticProxy() {
        //代理对象
        IWasher washer = new WasherImpl();
        //将代理对象传给代理类
        WasherProxy washerProxy = new WasherProxy(washer);
        //通过代理类调用代理对象的方法
        washerProxy.wash();
    }


    /*
       动态代理
     */
    @Test
    public void testDynamicProxy() {
        PersonDynamicProxy proxy = new PersonDynamicProxy(new Student());
        IPerson person = (IPerson) proxy.getProxyInstance();
        person.buy();
        person.sell();
    }


    /*
        Cglib代理： 代理对象不需要实现接口，只需引入cglib的jar包，然后在代理类中通过enhancer工具类创建代理类即可
     */
    @Test
    public void testCglibProxy() {
        DogCglibProxy proxy = new DogCglibProxy(new Dog("Tom"));
        Dog dogProxy = (Dog) proxy.getProxyInstance();
        dogProxy.free();
//        静态方法不会进行代理
//        Dog.sleep();
    }

}
