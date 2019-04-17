package com.interview.lock;

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
public class ReentrantLockStudy {

  public static void main(String[] args) {

    final ReentrantLock lock = new ReentrantLock();

    for (int i = 0; i < 10; i++) {
      new Thread(new Runnable() {
        @Override
        public void run() {
          try {
            System.out.println(Thread.currentThread().getName() + " get in");
            lock.tryLock();
            System.out.println(Thread.currentThread().getName());
          } catch (Exception e) {
            e.printStackTrace();
          } finally {
            lock.unlock();
          }
        }
      }, "Thread_" + i).start();
    }
  }
}
