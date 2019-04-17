package com.headfirst.strategyPattern.pojo;

import com.headfirst.strategyPattern.service.FlyBehavior;
import com.headfirst.strategyPattern.service.QuackBehavior;

/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/3/23
 * @Other:
 */
public abstract class Duck {

  FlyBehavior flyBehavior;
  QuackBehavior quackBehavior;

  public Duck() {
  }

  public abstract void display();

  public void performFly() {
    flyBehavior.fly();
  }

  public void performQuack() {
    quackBehavior.quack();
  }

  public void swim() {
    System.out.println("All ducks float,even decoys!");
  }
}
