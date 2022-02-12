package com.yxx.proxydemo;

import java.lang.reflect.Proxy;

public class TestDynamicProxy {
    public static void main(String[] args) {
        RealSubjectA realSubjectA=new RealSubjectA();
        //Proxy.newProxyInstance(ClassLoader,接口数组,InvocationHandler(把方法调用转到代理上))
        SubjectA proxySubjectA= (SubjectA) Proxy.newProxyInstance(SubjectA.class.getClassLoader(),new Class[]{SubjectA.class},new LogHandler(realSubjectA));
        //执行完上面的代码后，变量proxy包含一个SubjectA接口的动态实现，所有对proxy的调用
        //都被转到了InvocationHandler接口的handler上。
        RealSubjectB realSubjectB=new RealSubjectB();
        SubjectB proxySubjectB=(SubjectB) Proxy.newProxyInstance(SubjectB.class.getClassLoader(),new Class[]{SubjectB.class},new LogHandler(realSubjectB));
        proxySubjectA.setUser("heaven","123456");
        proxySubjectB.sayHello("heaven");

    }
}
