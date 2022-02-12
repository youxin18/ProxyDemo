package com.yxx.proxydemo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

public class LogHandler implements InvocationHandler {
    private Object proxied;
    LogHandler(Object proxied){
        this.proxied=proxied;
    }

    @Override
    //调用Proxy.newProxyInstance（）方法时，要传入一个InvocationHandler接口的实现，如下
    //传入invoke（）方法中的proxy参数时实现要代理接口的动态代理对象，通常不需要，
    //Method对象参数代表了被动态代理的接口要调用的方法，从method对象中可以获取这个方法名字，方法参数，
    //参数类型等，Object数组参数包含了被动态代理的方法需要的方法参数。
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("begain to invoke method:"+method.getName()+"params:" +
                Arrays.toString(args));
        Object result=method.invoke(proxied,args);
        System.out.println("invoke"+method.getName()+" end");
        return result;
    }
}
