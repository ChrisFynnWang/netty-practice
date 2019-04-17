package com.wfan.jvm.classload;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;


/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/6/27
 * @Other:
 */
public class SingletonTest
{
    private static final Set set = new HashSet<>();

    public static void main(String[] args)
    {
        final CountDownLatch latch = new CountDownLatch(1);
        for (int i = 0; i < 50000; i++)
        {
            new Thread(new Runnable()
            {
                @Override
                public void run()
                {
                    try
                    {
                        latch.await();
                        SingletonWrong instance = SingletonWrong.getInstance();
                        set.add(instance);
                        System.out.println(instance);
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
        while (Thread.activeCount() != 50002)
        {
            System.out.println("Ready...");
        }
        System.out.println("Go!");
        latch.countDown();
        while (Thread.activeCount() > 2)
        {

        }
        System.out.println(set.size());
    }
}
