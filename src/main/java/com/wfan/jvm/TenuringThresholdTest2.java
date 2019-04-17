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
public class TenuringThresholdTest2
{
    private static final int _1MB = 1024 * 1024;

    public static void testTenuringThreshold2()
        throws InterruptedException
    {
        byte[] allocation0, allocation1, allocation2, allocation3, allocation4;
        allocation0 = new byte[_1MB / 100];
        allocation1 = new byte[_1MB / 4];
        allocation2 = new byte[_1MB / 4];
        allocation3 = new byte[_1MB * 4];
        allocation4 = new byte[_1MB * 4];
        allocation4 = null;
        allocation4 = new byte[_1MB * 4];
        Base base = new Base();
        TimeUnit.SECONDS.sleep(1000);
    }

    public static void main(String[] args)
        throws InterruptedException
    {
        testTenuringThreshold2();
    }
}
