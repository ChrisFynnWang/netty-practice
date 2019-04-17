package com.wfan.jvm.classload;

import java.util.concurrent.TimeUnit;


/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/6/28
 * @Other:
 */
public class JoinTest
{
    public static void main(String[] args)
        throws InterruptedException
    {
        Thread t = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                try
                {
                    TimeUnit.SECONDS.sleep(3);
                    System.out.println("branch thread");
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }

            }
        });
        t.start();
        t.join();
        System.out.println("main");

    }

}
