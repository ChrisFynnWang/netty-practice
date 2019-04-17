package com.wfan.jvm.classload;

/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/6/25
 * @Other:
 */
public class Super
{
    public static final Object ok = new Object();

    static
    {
        System.out.println("Super init");
    }

    public static int value = 0;

    public static void say()
    {
        System.out.println("this is Super say");
    }
}
