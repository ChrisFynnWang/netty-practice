package com.headfirst.strategyPattern.practice.service.impl;

import com.headfirst.strategyPattern.practice.service.WeaponBehavior;

/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/3/26
 * @Other:
 */
public class BowAndArrowBehavior implements WeaponBehavior {

  @Override
  public void userWeapon() {
    System.out.println("BowAndArrowBehavior");
  }
}
