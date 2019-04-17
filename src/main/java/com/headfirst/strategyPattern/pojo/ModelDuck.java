package com.headfirst.strategyPattern.pojo;

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
public class ModelDuck extends Duck{

  public ModelDuck() {

  }

  public void setFlyBehavior(FlyBehavior flyBehavior){
    this.flyBehavior = flyBehavior;
  }

  @Override
  public void display() {
    System.out.println("I'm a real Model duck!");
  }
}
