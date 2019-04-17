package com.headfirst.strategyPattern.controller;

import com.headfirst.strategyPattern.pojo.DonaldDuck;
import com.headfirst.strategyPattern.pojo.Duck;
import com.headfirst.strategyPattern.pojo.MallarDuck;
import com.headfirst.strategyPattern.pojo.ModelDuck;
import com.headfirst.strategyPattern.service.impl.FlyRocketPowered;
import org.junit.Test;

/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/3/23、
 * @Other:
 */
public class MiniDuckSimulator {

  @Test
  public void mallarDuckTest() {
    Duck mallard = new MallarDuck();
    mallard.performQuack();
    mallard.performFly();
  }

  @Test
  public void donaldDuckTest() {
    Duck donaldDuck = new DonaldDuck();
    donaldDuck.performQuack();
    donaldDuck.performFly();
  }


  @Test
  public void modelDuckTest(){

    ModelDuck modelDuck = new ModelDuck();
    modelDuck.setFlyBehavior(new FlyRocketPowered());
    modelDuck.performFly();
  }

}
