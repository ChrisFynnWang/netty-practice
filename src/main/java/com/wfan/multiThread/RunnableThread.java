package com.wfan.multiThread;

/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/3/21
 * @Other:
 */
public class RunnableThread implements Runnable {

    int a = 0;

    @Override
    public void run() {
        synchronized ("") {
            a++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            a--;
            String tn = Thread.currentThread().getName();
            System.out.println(tn + "：a=" + a);
        }
    }
}
