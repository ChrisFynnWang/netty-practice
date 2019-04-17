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
public class HandlePromotion
{
    private static final int _1MB = 1024 * 1024;

    public static void testHandlePromotion()
        throws InterruptedException
    {
        byte[] allocation1, allocation2, allocation3, allocation4, allocation5, allocation6, allocation7;
        allocation1 = new byte[2 * _1MB];
        allocation2 = new byte[2 * _1MB];
        allocation3 = new byte[2 * _1MB];
        allocation1 = null;
//        allocation4 = new byte[2 * _1MB];
//        allocation5 = new byte[2 * _1MB];
//        allocation6 = new byte[2 * _1MB];
//        allocation4 = null;
//        allocation5 = null;
//        allocation6 = null;
//        allocation7 = new byte[2 * _1MB];
        TimeUnit.SECONDS.sleep(3);
    }

    public static void main(String[] args)
        throws InterruptedException
    {
        testHandlePromotion();
    }

}
