package com.wfan.jvm;

import java.util.concurrent.TimeUnit;
import org.junit.Test;


/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/6/24
 * @Other:
 */
public class TenuringThresholdTest
{
    private static final int _1MB = 1024 * 1024;

    public static void testTenuringThreshold()
        throws InterruptedException
    {
        byte[] allocation1, allocation2, allocation3;
        allocation1 = new byte[_1MB / 4];
        allocation2 = new byte[_1MB * 4];
        allocation3 = new byte[_1MB * 4];
        allocation3 = null;
        allocation3 = new byte[_1MB * 4];
        TimeUnit.SECONDS.sleep(5);
    }

    public static void main(String[] args)
        throws InterruptedException
    {
        testTenuringThreshold();
    }
}
