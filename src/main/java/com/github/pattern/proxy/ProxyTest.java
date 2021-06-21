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
 */
public class ProxyTest {

    /*
        介绍：
             1）代理模式就是为一个对象提供一个替身，以控制对这个对象的访问。通过代理对象访问目标对象，这样做的好处是：可以在目标对象实现的
                基础上增强额外的功能操作，及扩展目标对象的功能
             2）被代理的对象可以是远程对象、创建开销大的对象或需要安全控制的对象
             3）代理模式主要有三种形式：静态代理、动态代理、Cglib代理（属于动态代理的范畴）
             4）静态代理模式： 静态代理在使用时，需要定义接口或者父类，别代理对象与代理对象一起实现相同的接口或者继承相同父类，代理对象
                            通过调用相同的方法来调用目标对象的方法
             5）动态代理模式： 代理对象不要实现接口，但是目标对象要实现接口，否则不能用动态代理。代理对象的生成，利用JDK的API,动态的在内存中
                            构建代理对象，所以也叫JDK代理或者接口代理
             6) Cglib代理模式：cglib代理是在内存中构建一个子类对象从而实现对象目标对象功能拓展，底层是通过使用字节码的处理框架ASM来转换字节码并生成新的类。
                             使用cglib代理需要引用cglib的jar文件，代理的类不能为final类，目标对象的方法如果为final/static，那么也不会进行拦截。
     */


    /**
     * 静态代理方法：
     * 优点： 在不修改目标对象的功能前提下，通过代理对象对目标功能进行拓展
     * 缺点： 因为静态代理对象与目标对象要实现一样的接口，所以会有很多代理类，一旦接口增加方法，目标对象与代理对象都要重新维护
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


    /**
     * 动态代理
     */
    @Test
    public void testDynamicProxy() {
        PersonDynamicProxy proxy = new PersonDynamicProxy(new Student());
        IPerson person = (IPerson) proxy.getProxyInstance();
        person.buy();
        person.sell();
    }


    /**
     * Cglib代理： 代理对象不需要实现接口，只需引入cglib的jar包，然后在代理类中通过enhancer工具类创建代理类即可,但静态方法不会进行代理
     *
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
