package com.wfan.jvm.classload;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
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
public class SynchronizedTest
{
    private final static int COUNT = 20000;

    private final static int SLEEP_TIME = 5;

    private static int counter = 0;

    @Test
    public void sayTest()
        throws InterruptedException
    {
        Foo foo = new Foo();
        do
        {
            CountDownLatch latch = new CountDownLatch(1);
            TimeUnit.SECONDS.sleep(SLEEP_TIME);
            Foo.count = 0;
            for (int i = 0; i < COUNT; i++)
            {
                new Thread(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        try
                        {
                            latch.await();
                            foo.say();
                        }
                        catch (InterruptedException e)
                        {
                            e.printStackTrace();
                        }
                    }
                }).start();
            }
            System.out.println(Thread.activeCount());
            while (Thread.activeCount() < COUNT + 2)
            {
                System.out.println(Thread.activeCount());
                System.out.println("Ready...");
            }
            System.out.println("Go!");
            latch.countDown();
            while (Thread.activeCount() > 2)
            {

            }
            counter++;
        }
        while (Foo.count == COUNT);
        System.out.println("counter :" + counter + " Foo.count :" + Foo.count);

    }

    @Test
    public void testActiveCount()
    {
        System.out.println(Thread.activeCount());
    }

    @Test
    public void doWhile()
    {
        do
        {
            System.out.println("go");
        }
        while (true);
    }

}
