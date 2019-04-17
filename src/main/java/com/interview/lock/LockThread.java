package com.interview.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/7/4
 * @Other:
 */
public class LockThread implements Runnable {

  private Lock lockA;

  private Lock lockB;

  public LockThread(Lock lockA, Lock lockB) {
    this.lockA = lockA;
    this.lockB = lockB;
  }

  @Override
  public void run() {
    lockA.lock();
    try {
      System.out.println(Thread.currentThread().getName() + " come in");
      TimeUnit.SECONDS.sleep(1000);
      if (lockB.tryLock(3, TimeUnit.SECONDS)) {
        System.out.println(Thread.currentThread().getName() + "get lock" + lockB.toString());
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      lockA.unlock();
    }
  }
}
