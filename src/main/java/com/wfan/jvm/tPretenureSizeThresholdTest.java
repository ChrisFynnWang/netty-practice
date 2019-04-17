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
public class tPretenureSizeThresholdTest
{
    public static void main(String[] args)
        throws InterruptedException
    {
        byte[] allocation;
        allocation = new byte[1024 * 1024 * 4];
        TimeUnit.SECONDS.sleep(10);
    }
}
