package com.headfirst.strategyPattern.service.impl;

import com.headfirst.strategyPattern.service.FlyBehavior;

/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/3/25
 * @Other:
 */
public class FlyRocketPowered implements FlyBehavior{


  @Override
  public void fly() {
    System.out.println("Fly with Rocket Powered!!");
  }
}
