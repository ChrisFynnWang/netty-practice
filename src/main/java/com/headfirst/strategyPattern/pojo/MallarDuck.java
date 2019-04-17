package com.headfirst.strategyPattern.pojo;

import com.headfirst.strategyPattern.service.impl.FlyWithWings;
import com.headfirst.strategyPattern.service.impl.Quack;

/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/3/23
 * @Other:
 */
public class MallarDuck extends Duck {

    public MallarDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck!");
    }
}
