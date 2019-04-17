package com.wfan.proxy;

/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/3/15
 * @Other:
 */
public class RealSubject implements Subject {


    @Override
    public void request() {

        System.out.println("RealSubject request");

    }
}
