package com.headfirst.strategyPattern.service.impl;

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
public class SpeakEnglish implements QuackBehavior {

  @Override
  public void quack() {
    System.out.println("Speak English Duck!!!");
  }
}
