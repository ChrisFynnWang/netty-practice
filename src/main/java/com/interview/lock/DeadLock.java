package com.interview.lock;

/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/7/4
 * @Other:
 */
public class DeadLock {


  public static void main(String[] args) {

    Object objA = new Object();
    Object objB = new Object();
    SyncThread syncThreadA = new SyncThread(objA, objB);
    SyncThread syncThreadB = new SyncThread(objB, objA);

    for (int i = 0; i < 1000; i++) {
      new Thread(syncThreadA).start();
      new Thread(syncThreadB).start();
    }
  }
}
