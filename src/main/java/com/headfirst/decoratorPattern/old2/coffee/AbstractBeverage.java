package com.headfirst.decoratorPattern.old2.coffee;

import com.headfirst.decoratorPattern.old2.Beverage;
import com.headfirst.decoratorPattern.old2.size.CoffeeSize;
import javax.validation.Valid;
import javax.validation.constraints.Email;

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

  private String description;

  private CoffeeSize coffeeSize;

  public AbstractBeverage(CoffeeSize coffeeSize) {
    this.coffeeSize = coffeeSize;
    this.price = coffeeSize.getPrice();
  }

  public Enum getSize() {
    return this.coffeeSize;
  }

  public double cost() {
    return this.price;
  }

  public String getDescription() {
    return this.getClass().getSimpleName();
  }
}
