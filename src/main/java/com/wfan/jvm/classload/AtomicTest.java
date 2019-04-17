package com.wfan.jvm.classload;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;


/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/6/27
 * @Other:
 */
public class AtomicTest
{
    private static final int THREAD_COUNT = 20;

    private static final int ADD_COUNT = 1000000;

    private static final CountDownLatch LATCH = new CountDownLatch(1);

    private static AtomicInteger race = new AtomicInteger(0);

    private static int count = 0;

    public static void increase()
    {
//        count++;
        race.incrementAndGet();
    }

    public static void main(String[] args)
        throws IOException, NoSuchFieldException, IllegalAccessException
    {
        for (int i = 0; i < THREAD_COUNT; i++)
        {
            new Thread(new Runnable()
            {
                @Override
                public void run()
                {
                    try
                    {
                        LATCH.await();
                        for (int j = 0; j < ADD_COUNT; j++)
                        {
                            increase();
                        }
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
        LATCH.countDown();
        while (Thread.activeCount() > 2)
        {

        }
        System.out.println("race :" + race);
        System.out.println("count :" + count);
    }
}
