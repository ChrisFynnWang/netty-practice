package com.wfan.jvm;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/6/25
 * @Other:
 */
public class DeadLoop
{
    public static void createBusyThread()
    {
        Thread thread = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                while (true)
                {

                }
            }
        }, "testBusyThread");
        thread.start();
    }

    public static void createLockThread(final Object lock)
    {
        Thread thread = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                synchronized (lock)
                {
                    try
                    {
                        lock.wait();
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
            }
        }, "testLockThread");
        thread.start();
    }

    public static void main(String[] args)
        throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        reader.readLine();
        createBusyThread();
        Object lock = new Object();
        createLockThread(lock);
    }
}
