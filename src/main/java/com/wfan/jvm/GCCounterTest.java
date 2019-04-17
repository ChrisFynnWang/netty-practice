package com.wfan.jvm;

import org.junit.Test;


/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/6/23
 * @Other:
 */
public class GCCounterTest
{
    public Object instance = null;

    private static final int MB = 1024 * 1024;

    /**
     * 这个成员属性的唯一意义就是占点内存，以便能在GC日志中看清楚是否被回收过
     */
    public static void testGC()
    {
        GCCounterTest objA = new GCCounterTest();
        GCCounterTest objB = new GCCounterTest();
        objA.instance = objB;
        objB.instance = objA;
        objA = null;
        objB = null;
//假设在这行发生GC,objA和objB是否能被回收？
        System.gc();
    }

    public static void main(String[] args)
    {
        testGC();
    }
}

