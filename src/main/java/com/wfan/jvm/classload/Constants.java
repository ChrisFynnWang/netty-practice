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
public class Constants
{
    static
    {
        System.out.println("Constants init");
    }

    public static String HELLO_WORLD = "hello,world";

    public static Object obj = new Object();
}
