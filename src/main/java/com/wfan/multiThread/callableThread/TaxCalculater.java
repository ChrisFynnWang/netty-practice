package com.wfan.multiThread.callableThread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/3/22
 * @Other:
 */
public class TaxCalculater implements Callable<Integer> {

    private int seedMoney;

    public TaxCalculater(int seedMoney) {
        this.seedMoney = seedMoney;
    }

    @Override
    public Integer call() throws Exception {

        TimeUnit.MILLISECONDS.sleep(10000);
        return seedMoney / 10;
    }

    public static void main(String[] args)
        throws InterruptedException, ExecutionException, TimeoutException {

        ExecutorService es = Executors.newSingleThreadExecutor();
        ExecutorService ess = Executors.newFixedThreadPool(10);

        Future<Integer> future = es.submit(new TaxCalculater(100));

        while (!future.isDone()) {
            TimeUnit.MILLISECONDS.sleep(200);
            System.out.print("#");
        }
        System.out.println("\n计算完成，税务是" + future.get());
        es.shutdown();
    }
}
