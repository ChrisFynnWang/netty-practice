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
public enum FlavourSize {

  TALL(2.0), GRANDE(1.5), VENTI(1.0);

  public double price;

  FlavourSize(double price) {
    this.price = price;
  }

  public double getPrice() {
    return this.price;
  }
}
