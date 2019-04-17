package com.wfan.jvm.classload;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;


/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/6/27
 * @Other:
 */
public class SingletonWrong
{
    private static final SingletonWrong instance = new SingletonWrong();

    private static final Set set = new HashSet<>();

    private SingletonWrong()
    {

    }

    public static SingletonWrong getInstance()
    {
        return instance;
    }
}
