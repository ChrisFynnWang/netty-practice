package com.wfan.multiThread.threadPool;

import java.lang.Thread.State;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.ThreadUtils;

/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/3/22
 * @Other:
 */
public class SingleThread {

    public static void main(String[] args) throws InterruptedException {

        System.out.println(Calendar.getInstance().get(12));
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        });
        thread.start();
        if (!thread.getState().equals(State.TERMINATED)) {
            TimeUnit.MILLISECONDS.sleep(1000);
        }
//        thread.start();
    }

}
