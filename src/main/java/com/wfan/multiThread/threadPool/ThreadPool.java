package com.wfan.multiThread.threadPool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/3/22
 * @Other:
 */
public class ThreadPool {

    public static void main(String[] args) {
        ExecutorService ess = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 6; i++) {
            ess.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                    try {
                        TimeUnit.MILLISECONDS.sleep(10000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        ess.shutdown();
    }
}
