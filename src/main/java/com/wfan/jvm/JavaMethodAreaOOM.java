package com.wfan.jvm;

import java.lang.reflect.Method;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;


/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/6/23
 * @Other:
 */
public class JavaMethodAreaOOM
{
    public static void main(final String[] args)
    {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(OOMObject.class);
        enhancer.setUseCache(false);
        enhancer.setCallback(new MethodInterceptor()
        {
            @Override
            public Object intercept(Object o, Method method, Object[] objects,
                                    MethodProxy methodProxy)
                throws Throwable
            {
                return methodProxy.invokeSuper(objects, args);
            }
        });
        enhancer.create();
    }

    static class OOMObject
    {
    }
}

