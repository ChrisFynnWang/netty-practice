package com.wfan.jvm;

import java.util.concurrent.TimeUnit;
import org.omg.CORBA.TIMEOUT;


/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/6/24
 * @Other:
 */
public class GCLogTest
{
    private static final int _1MB = 1024 * 1024;

    public static void testAllocation()
    {
        byte[] allocation1, allocation2, allocation3, allocation4, allocation5, allocation6, allocation7, allocation8, allocation9;
        allocation1 = new byte[2 * _1MB];
        allocation2 = new byte[2 * _1MB];
        allocation3 = new byte[2 * _1MB];
        allocation4 = new byte[4 * _1MB];
    }

    public static void main(String[] args)
        throws InterruptedException
    {
        testAllocation();
        System.out.println("11111");
    }
}

