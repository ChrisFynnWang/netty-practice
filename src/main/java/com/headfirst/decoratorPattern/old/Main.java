package com.headfirst.decoratorPattern.old;

import com.headfirst.decoratorPattern.old.type.DarkRoast;

/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/3/31
 * @Other:
 */
public class Main {

  public static void main(String[] args) {
    Whip whip = new Whip(new Mocha(new DarkRoast(null, 1.5), 1.5), 1.5);
    System.out.println(whip.cost());
    System.out.println(whip.getDescription());
  }
}
