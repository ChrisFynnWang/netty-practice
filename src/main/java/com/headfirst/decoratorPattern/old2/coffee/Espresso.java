package com.headfirst.decoratorPattern.old2.coffee;

import com.headfirst.decoratorPattern.old2.size.CoffeeSize;

/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/3/31
 * @Other:
 */
public class Espresso extends AbstractBeverage {

  public Espresso(CoffeeSize coffeeSize) {
    super(coffeeSize);
  }
}
