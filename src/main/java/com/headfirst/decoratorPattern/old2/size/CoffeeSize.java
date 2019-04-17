package com.headfirst.decoratorPattern.old2.size;

/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/4/1
 * @Other:
 */
public enum CoffeeSize {

  TALL(3.5),
  GRANDE(3),
  VENTI(2.5);

  public double price;

  CoffeeSize(double price) {
    this.price = price;
  }

  public double getPrice() {
    return this.price;
  }
}
