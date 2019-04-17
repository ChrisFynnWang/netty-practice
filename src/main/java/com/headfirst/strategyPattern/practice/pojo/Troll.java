package com.headfirst.strategyPattern.practice.pojo;

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
public class Troll extends Characters {

  public Troll(WeaponBehavior weapon) {
    this.weapon = weapon;
  }
}
