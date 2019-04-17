package com.headfirst.strategyPattern.pojo;

import com.headfirst.strategyPattern.service.impl.FlyNoWay;
import com.headfirst.strategyPattern.service.impl.SpeakEnglish;

/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/3/23
 * @Other:
 */
public class DonaldDuck extends Duck {

  public DonaldDuck() {
    quackBehavior = new SpeakEnglish();
    flyBehavior = new FlyNoWay();
  }

  @Override
  public void display() {
    System.out.println("I'm DonaldDuck");
  }
}
