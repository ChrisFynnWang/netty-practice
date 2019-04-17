package com.wfan.jvm.classload;

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
public class Singleton
{
    private static volatile Singleton instance;

    private Singleton()
    {

    }

    public static Singleton getInstance()
    {
        if (instance == null)
        {
            synchronized (Singleton.class)
            {
                if (instance == null)
                {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args)
    {
        CountDownLatch latch = new CountDownLatch(1);
        for (int i = 0; i < 10000; i++)
        {
            new Thread(new Runnable()
            {
                @Override
                public void run()
                {
                    try
                    {
                        latch.await();
                        Singleton instance = Singleton.getInstance();
                        System.out.println(instance);
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
        while (Thread.activeCount() == 10002)
        {
            latch.countDown();
        }
    }
}
