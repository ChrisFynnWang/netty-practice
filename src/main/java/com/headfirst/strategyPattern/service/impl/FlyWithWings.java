package com.headfirst.strategyPattern.service.impl;

import com.headfirst.strategyPattern.service.FlyBehavior;

/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/3/23
 * @Other:
 */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying!!");
    }
}
