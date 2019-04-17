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
public class Foo
{
    public static int count = 0;

    public synchronized void say()
    {
        count++;
    }

    public static synchronized void scream()
    {
        count++;
    }
}
