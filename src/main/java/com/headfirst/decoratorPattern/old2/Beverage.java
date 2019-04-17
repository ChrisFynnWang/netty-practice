package com.headfirst.decoratorPattern.old2;

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
public interface Beverage {

  public double cost();

  public String getDescription();

  public Enum getSize();

}
