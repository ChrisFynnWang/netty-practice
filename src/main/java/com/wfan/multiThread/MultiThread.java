package com.wfan.multiThread;

import com.sun.org.glassfish.gmbal.ManagedObject;

/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/3/21
 * @Other:
 */
public class MultiThread extends Thread {


    @Override
    public void start() {
        super.start();

    }
    @Override
    public void run(){
        System.out.println("run");
    }


}
