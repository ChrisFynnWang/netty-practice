package com.headfirst.decoratorPattern.old2.flavour;

import com.headfirst.decoratorPattern.old2.Beverage;

/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/4/1
 * @Other:
 */
public class Soy extends DecoratorsBeverage {

  public Soy(Beverage beverage) {
    super(beverage);
  }
}
