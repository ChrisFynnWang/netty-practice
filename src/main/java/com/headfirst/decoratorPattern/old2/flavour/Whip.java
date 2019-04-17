package com.headfirst.decoratorPattern.old2.flavour;

import com.headfirst.decoratorPattern.old2.Beverage;

/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/3/31
 * @Other:
 */
public class Whip extends DecoratorsBeverage {


  public Whip(Beverage beverage) {
    super(beverage);
  }
}
