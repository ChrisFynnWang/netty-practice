package com.headfirst.strategyPattern.practice.controller;

import com.headfirst.strategyPattern.practice.pojo.Characters;
import com.headfirst.strategyPattern.practice.pojo.King;
import com.headfirst.strategyPattern.practice.pojo.Knight;
import com.headfirst.strategyPattern.practice.pojo.Queen;
import com.headfirst.strategyPattern.practice.pojo.Troll;
import com.headfirst.strategyPattern.practice.service.impl.AxeBehavior;
import com.headfirst.strategyPattern.practice.service.impl.BowAndArrowBehavior;
import com.headfirst.strategyPattern.practice.service.impl.KnifeBehavior;
import com.headfirst.strategyPattern.practice.service.impl.SwordBehavior;

/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/3/26
 * @Other:
 */
public class WeaponController {

  public static void main(String[] args) {

    Characters king = new King(new SwordBehavior());
    king.fight();
    Characters queen = new Queen(new BowAndArrowBehavior());
    queen.fight();
    Characters knight = new Knight(new KnifeBehavior());
    knight.fight();
    Characters troll = new Troll(new AxeBehavior());
    troll.fight();
    troll.setWeapon(new SwordBehavior());
    troll.fight();
  }
}
