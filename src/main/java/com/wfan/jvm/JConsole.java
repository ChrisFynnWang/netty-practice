package com.wfan.jvm;

import java.util.ArrayList;
import java.util.List;


/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/6/25
 * @Other:
 */
public class JConsole
{
    public byte[] placeholder = new byte[64 * 1024];

    public static void fillHeap(int num)
        throws InterruptedException
    {
        List<Object> list = new ArrayList<>();
        for (int i = 0; i < num; i++)
        {
            Thread.sleep(50);
            list.add(new JConsole());
        }
    }

    public static void main(String[] args)
        throws InterruptedException
    {
        fillHeap(1000);
//        System.gc();
    }
}
