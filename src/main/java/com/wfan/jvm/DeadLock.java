package com.wfan.jvm;

/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/6/25
 * @Other:
 */
public class DeadLock implements Runnable
{
    private int a, b;

    public DeadLock(int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run()
    {
        synchronized (Integer.valueOf(a))
        {
            synchronized (Integer.valueOf(b))
            {
                System.out.println(a + b);
            }
        }
    }

    public static void main(String[] args)
    {
        int a = 1;
        int b = 2;
        for (int i = 0; i < 100; i++)
        {
            new Thread(new DeadLock(a, b)).start();
            new Thread(new DeadLock(b, a)).start();
        }
    }
}
