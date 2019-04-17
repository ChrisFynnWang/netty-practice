package com.wfan.jvm.classload;

/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/6/26
 * @Other:
 */
public class TestLocalVarible
{
    public static void main(String[] args)
    {
        {
            byte[] bytes = new byte[64 * 1024 * 1024];
        }
        int a = 0;
        System.gc();
    }
}
