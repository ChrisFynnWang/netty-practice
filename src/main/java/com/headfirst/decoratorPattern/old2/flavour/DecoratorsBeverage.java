package com.headfirst.decoratorPattern.old2.flavour;

import com.google.common.collect.Lists;
import com.headfirst.decoratorPattern.old2.Beverage;
import com.headfirst.decoratorPattern.old2.size.CoffeeSize;
import com.headfirst.decoratorPattern.old2.size.FlavourSize;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.collections.ListUtils;

/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/3/31
 * @Other:
 */
public abstract class DecoratorsBeverage implements Beverage {

  private Beverage beverage;

  private double price;

  private String description;

  private FlavourSize size;

  private static final List<FlavourSize> list = Arrays.asList(FlavourSize.values());

  public DecoratorsBeverage(Beverage beverage) {
    this.beverage = beverage;
    String sizeName = beverage.getSize().name();
    this.size = FlavourSize.valueOf(sizeName);
    this.price = size.getPrice();
  }

  public Enum getSize() {

    return this.size;
  }

  @Override
  public double cost() {
    return this.price + beverage.cost();
  }

  public String getDescription() {

    return this.getClass().getSimpleName() + " + " + beverage.getDescription();
  }
}
