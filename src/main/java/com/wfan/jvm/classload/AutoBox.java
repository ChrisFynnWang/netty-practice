package com.wfan.jvm.classload;

import org.junit.Test;


/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/6/27
 * @Other:
 */
public class AutoBox
{

    @Test
    public void testBox()
    {
        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;
        Long g = 3L;
        System.out.println(c == d); //True,在赋值的时候使用Integer.valueOf(),在-128~127的范围中会缓存。
        System.out.println(e == f); //False,超出范围，不会缓存
        System.out.println(c == (a + b)); // True,遇到算数运算符，==两边会自动拆箱。
        System.out.println(c.equals(a + b)); //True,必较的是包装类中实际的值。
        System.out.println(g == (a + b)); //True,会自动拆箱,然后会将int类型升级为long比较。
        System.out.println(g.equals(a + b)); //False,equals()方法不处理数据转型的关系
    }
}
