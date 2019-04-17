package com.wfan.stringSafe;

import java.util.concurrent.TimeUnit;

/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/3/23
 * @Other:
 */
public class StringSafe implements Runnable {

    private StringBuffer sbf;

    private StringBuilder sbd;

    private int time;

    public StringSafe(StringBuffer sbf, StringBuilder sbd, int time) {

        this.sbf = sbf;
        this.sbd = sbd;
        this.time = time;
    }

    @Override
    public void run() {

        for (int i = 0; i < time; i++) {
            sbf.append(1);
            sbd.append(1);
        }
        Thread.currentThread().interrupt();
    }

    public static void main(String[] args) throws InterruptedException {

        StringBuffer sbf = new StringBuffer();
        StringBuilder sbd = new StringBuilder();
        StringSafe ss = new StringSafe(sbf, sbd, 1000);
        for (int i = 0 ; i < 10 ;i++) {
            new Thread(ss).start();
        }
        while (Thread.currentThread().getThreadGroup().activeCount() != 2) {
            TimeUnit.SECONDS.sleep(3);
        }
        System.out.println(sbf.length());
        System.out.println(sbd.length());
    }
}
