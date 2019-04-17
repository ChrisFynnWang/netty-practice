package com.wfan.jvm.action;

import java.lang.management.ClassLoadingMXBean;
import java.lang.management.ManagementFactory;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import net.sf.cglib.proxy.CallbackFilter;
import net.sf.cglib.proxy.Dispatcher;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;


/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @VM option: -XX:MetaspaceSize=5M -XX:MaxMetaspaceSize=7M -XX:+HeapDumpOnOutOfMemoryError
 * -XX:HeapDumpPath=e:\oom.dump
 * @Params:
 * @Return:
 * @Date:2018/6/29
 * @Other:
 */

public class MetaSpaceTest
{
    public static void main(String[] args)
        throws InterruptedException
    {
        TimeUnit.SECONDS.sleep(5);
        ClassLoadingMXBean loadingBean = ManagementFactory.getClassLoadingMXBean();
        System.out.println("Let us do it now.....");
        for (int i = 0; i < 1000000; i++)
        {
            Enhancer enhancer = new Enhancer();
            enhancer.setSuperclass(OOMObject.class);
            enhancer.setCallbackTypes(new Class[] {
                Dispatcher.class, MethodInterceptor.class});
            enhancer.setCallbackFilter(new CallbackFilter()
            {
                public int accept(Method method)
                {
                    return 1;
                }
            });
            Class clazz = enhancer.createClass();
            //显示数量信息（共加载过的类型数目，当前还有效的类型数目，已经被卸载的类型数目）
            System.out.println("total: " + loadingBean.getTotalLoadedClassCount());
            System.out.println("active: " + loadingBean.getLoadedClassCount());
            System.out.println("unloaded: " + loadingBean.getUnloadedClassCount());
        }
    }

    static class OOMObject
    {
    }
}
