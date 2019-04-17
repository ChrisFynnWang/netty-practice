package com.headfirst.decoratorPattern.old.type;

import com.headfirst.decoratorPattern.old.AbstractBeverage;
import com.headfirst.decoratorPattern.old.Beverage;

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

  public Espresso(Beverage beverage, double price) {
    super(beverage, price);
  }
}
