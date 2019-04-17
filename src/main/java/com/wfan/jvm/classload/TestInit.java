package com.wfan.jvm.classload;

import org.junit.Test;


/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/6/25
 * @Other:
 */
public class TestInit
{
    @Test
    public void testInit()
    {
        System.out.println(Sub.ok);
//        Sub.say();
//        System.out.println(Sub.value);
    }

    @Test
    public void testInit2()
    {
        Super[] array = new Super[100];
    }

    @Test
    public void testInit3()
    {
        System.out.println(Constants.HELLO_WORLD);
        System.out.println(Constants.obj);
    }

}
