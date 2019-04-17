package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/5/11
 * @Other:
 */
public class JunitTest
{

    @BeforeClass
    public static void beforeClass()
    {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @AfterClass
    public static void afterClass()
    {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @Test
    public void test1()
    {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @Test
    public void test2()
    {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @Test
    public void test3()
    {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @Test
    public void test4()
    {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @Test
    public void test5()
    {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @Test
    public void listTest()
    {
        ArrayList arrayList = null;
        if (arrayList.isEmpty() || arrayList == null)
        {
            System.out.println("no content");
        }
    }

    @Test
    public void goTest()
    {
        Integer integer = new Integer(1);
        if (integer == 1)
        {
            System.out.println(111);
        }
    }

    @Test
    public void listRemoveTest()
    {
        long start = System.currentTimeMillis();
        ArrayList<String> objects = new ArrayList<>();
        for (int i = 0; i < 1000000; i++)
        {
            String s = RandomStringUtils.randomNumeric(1);
            objects.add(s);
        }

        System.out.println(objects);
        for (int i = 0; i < objects.size(); i++)
        {
            if (objects.get(i).equals("1"))
            {
                objects.set(i, null);
            }
        }
        objects.removeIf(a -> a == null);

        for (int i = 0; i < objects.size();)
        {
            if (objects.get(i).equals("1"))
            {
                objects.remove(i);
                continue;
            }
            i++;
        }

        System.out.println(objects);
        System.out.println(objects.size());
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    @Test
    public void setTest()
    {
        long start = System.currentTimeMillis();
        TreeSet<Integer> objects = new TreeSet<>();
        for (int i = 0; i < 100000000; i++)
        {
            int num = RandomUtils.nextInt(0, 10);
            objects.add(num);
        }
        System.out.println(new ArrayList<>(objects));
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    @Test
    public void setTest2()
    {
        long start = System.currentTimeMillis();
        HashSet<Integer> objects = new HashSet<>();
        for (int i = 0; i < 100000000; i++)
        {
            int num = RandomUtils.nextInt(0, 10);
            objects.add(num);
        }
        List<Integer> objects1 = new ArrayList<>(objects);
        Collections.sort(objects1);
        System.out.println(objects1);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
