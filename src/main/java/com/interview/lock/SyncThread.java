package com.interview.lock;

import java.util.concurrent.TimeUnit;

/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/7/4
 * @Other:
 */
public class SyncThread implements Runnable {

  private Object objA;

  private Object objB;

  public SyncThread(Object objA, Object objB) {

    this.objA = objA;
    this.objB = objB;
  }

  @Override
  public void run() {

    synchronized (objA) {
      synchronized (objB) {
      }
    }
  }
}
