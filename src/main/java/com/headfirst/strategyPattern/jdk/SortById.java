package com.headfirst.strategyPattern.jdk;

import java.util.Comparator;

/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/7/3
 * @Other:
 */
public class SortById implements Comparator<Employee> {

  @Override
  public int compare(Employee o1, Employee o2) {

    return o1.getId() - o2.getId();
  }
}
