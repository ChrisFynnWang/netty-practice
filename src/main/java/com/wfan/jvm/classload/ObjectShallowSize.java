package com.wfan.jvm.classload;

/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/6/27
 * @Other:
 */


import java.lang.instrument.Instrumentation;


public class ObjectShallowSize
{
    private static Instrumentation inst;

    public static void premain(String agentArgs, Instrumentation instP)
    {
        inst = instP;
    }

    public static long sizeOf(Object obj)
    {
        return inst.getObjectSize(obj);
    }
}
