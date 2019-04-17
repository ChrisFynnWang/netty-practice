package com.wfan.jvm;

import java.util.concurrent.TimeUnit;


/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/6/24
 * @Other:
 */
public class JstackTest
{

    public static void main(String[] args)
    {
        for (int i = 0; i < 100; i++)
        {
            new Thread(new Runnable()
            {
                @Override
                public void run()
                {
                    try
                    {
                        System.out.println(Thread.currentThread().getName());
                        TimeUnit.SECONDS.sleep(1000);
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }
}
