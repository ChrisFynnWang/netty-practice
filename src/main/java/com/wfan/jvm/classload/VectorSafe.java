package com.wfan.jvm.classload;

import java.util.Vector;


/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/6/27
 * @Other:
 */
public class VectorSafe
{
    private static Vector<Integer> VECTOR = new Vector<>();

    public static void main(String[] args)
    {
        while (true)
        {
            for (int i = 0; i < 10; i++)
            {
                VECTOR.add(i);
            }

            Thread removeThread = new Thread(new Runnable()
            {
                @Override
                public void run()
                {
                    for (int i = 0; i < VECTOR.size(); i++)
                    {
                        VECTOR.remove(i);
                    }
                }
            });

            Thread printThread = new Thread(new Runnable()
            {
                @Override
                public void run()
                {
                    for (int i = 0; i < VECTOR.size(); i++)
                    {
                        System.out.println(VECTOR.get(i));
                    }
                }
            });
            removeThread.start();
            printThread.start();
            while (Thread.activeCount() > 20)
            { ; }
        }
    }
}
