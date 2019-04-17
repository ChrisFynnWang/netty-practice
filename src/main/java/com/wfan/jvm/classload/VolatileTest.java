package com.wfan.jvm.classload;

/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/6/27
 * @Other:
 */
public class VolatileTest
{
    private static volatile int race = 0;

    private static final int THREADS_COUNT = 20;

    private static final int COUNT_TIMES = 20000;

    public static void increase()
    {
        race++;
    }

    public static void main(String[] args)
    {
        for (int i = 0; i < THREADS_COUNT; i++)
        {
            new Thread(new Runnable()
            {
                @Override
                public void run()
                {
                    for (int j = 0; j < COUNT_TIMES; j++)
                    {
                        increase();
                    }
                }
            }).start();
        }
        while (Thread.activeCount() > 2)
        { ; }
//        {
//            System.out.println(Thread.currentThread().getName());
//            Thread.yield();
//        }
        System.out.println("race : " + race);
    }
}
