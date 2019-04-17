package com.interview.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/7/4
 * @Other:
 */
public class ReentrantLockTest {

  public static void main(String[] args) {
    ReentrantLock lockA = new ReentrantLock();
    ReentrantLock lockB = new ReentrantLock();

    new Thread(new Runnable() {
      @Override
      public void run() {
        lockA.lock();
        try {
          System.out.println(Thread.currentThread().getName() + " come in");
          TimeUnit.SECONDS.sleep(1);
          if (lockB.tryLock(5, TimeUnit.SECONDS)) {
            try {
              System.out.println(Thread.currentThread().getName() + "get lock" + lockB.toString());
            } finally {
              lockB.unlock();
            }
          } else {

          }
        } catch (Exception e) {
          e.printStackTrace();
        } finally {
          lockA.unlock();
        }
      }
    }, "小李").start();
    new Thread(new Runnable() {
      @Override
      public void run() {
        lockB.lock();
        try {
          System.out.println(Thread.currentThread().getName() + " come in");
          TimeUnit.SECONDS.sleep(1);
          if (lockA.tryLock(5, TimeUnit.SECONDS)) {
            try {
              System.out.println(Thread.currentThread().getName() + "get lock" + lockA.toString());
            } finally {
              lockA.unlock();
            }
          }
        } catch (Exception e) {
          e.printStackTrace();
        } finally {
          lockB.unlock();
        }
      }
    }, "小明").start();
  }
}
