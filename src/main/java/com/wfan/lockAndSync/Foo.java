package com.wfan.lockAndSync;

import com.sun.xml.internal.ws.binding.SOAPBindingImpl;
import java.sql.Time;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/3/22
 * @Other:
 */
public class Foo {

    private final ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
    private Lock r = rwl.readLock();
    private Lock w = rwl.writeLock();

    public void read() {
        try {
            r.lock();
            TimeUnit.SECONDS.sleep(3);
            System.out.println("read lock");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            r.unlock();
        }
    }

    public void write() {
        try {
            w.unlock();
            TimeUnit.SECONDS.sleep(3);
            System.out.println("write lock");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            w.unlock();
        }
    }
}
