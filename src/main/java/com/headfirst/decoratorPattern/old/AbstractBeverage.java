package com.headfirst.decoratorPattern.old;

/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/3/31
 * @Other:
 */
public abstract class AbstractBeverage implements Beverage {

  private double price;

  public AbstractBeverage(Beverage beverage, double price) {
    if (beverage == null) {
      this.price = 0 + price;
    } else {
      this.price = beverage.cost() + price;
    }
  }

  @Override
  public double cost() {
    return price;
  }

  public String getDescription() {
    return null;
  }
}
