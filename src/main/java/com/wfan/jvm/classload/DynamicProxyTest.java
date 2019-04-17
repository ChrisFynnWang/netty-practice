package com.wfan.jvm.classload;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/6/26
 * @Other:
 */
public class DynamicProxyTest
{

    interface IHello
    {
        void sayHello();

        void sayBye();
    }


    static class Hello implements IHello
    {
        @Override
        public void sayHello()
        {
            System.out.println("hello world");
        }

        @Override
        public void sayBye()
        {
            System.out.println("bye bye");
        }

    }


    static class DynamicProxy implements InvocationHandler
    {
        Object originalObj;

        Object bind(Object originalObj)
        {
            this.originalObj = originalObj;
            return Proxy.newProxyInstance(originalObj.getClass().getClassLoader(),
                originalObj.getClass().getInterfaces(), this);
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable
        {
            System.out.println("welcome");
            return method.invoke(originalObj, args);
        }
    }

    public static void main(String[] args)
    {
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        IHello hello = (IHello)new DynamicProxy().bind(new Hello());
//        hello.sayHello();
        hello.sayBye();
    }
}
