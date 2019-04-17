package com.wfan.stringSafe;

import java.util.concurrent.TimeUnit;
import sun.awt.windows.ThemeReader;

/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/3/23
 * @Other:
 */
public class MainT {

    public static int member = 20;

    public static void main(String[] args) throws InterruptedException {
//        ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
//        System.out.println(Thread.activeCount());
//        threadGroup.list();
        MainT mt1 = new MainT();
        MainT mt2 = new MainT();
        new Thread(new Runnable() {
            @Override
            public void run() {
                mt1.member = 30;
                System.out.println(mt1.member);
            }
        }).start();
        TimeUnit.SECONDS.sleep(3);
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(mt2.member);
            }
        }).start();
    }
    StringSafety st = new StringSafetyImpl("name");
}
