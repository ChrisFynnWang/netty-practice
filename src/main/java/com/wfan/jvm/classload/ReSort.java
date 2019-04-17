package com.wfan.jvm.classload;

import java.util.HashMap;
import java.util.Map;


/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/6/27
 * @Other:
 */
public class ReSort
{
    Map configOptions;

    char configText;

    volatile boolean initialized = false;

    public static void main(String[] args)
    {
        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
            }
        });
    }

}
