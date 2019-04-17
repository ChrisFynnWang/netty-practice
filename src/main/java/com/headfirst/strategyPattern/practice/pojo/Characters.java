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
public abstract class Characters {

  WeaponBehavior weapon;

  public Characters() {

  }

  public Characters(WeaponBehavior weapon) {
    this.weapon = weapon;
  }

  public void fight() {

    weapon.userWeapon();
  }

  public void setWeapon(WeaponBehavior weapon) {

    this.weapon = weapon;
  }
}
