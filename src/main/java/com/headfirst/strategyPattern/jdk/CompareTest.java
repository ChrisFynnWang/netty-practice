package com.headfirst.strategyPattern.jdk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.junit.Test;

/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/7/3
 * @Other:
 */
public class CompareTest {

  @Test
  public void compareTest() {
    List<Employee> list = new ArrayList<>();

    for (int i = 0; i < 5; i++) {
      list.add(new Employee(RandomUtils.nextInt(10, 100), RandomStringUtils.randomAlphabetic(6)));
    }

    for (Employee e : list) {
      System.out.println(ToStringBuilder.reflectionToString(e, ToStringStyle.MULTI_LINE_STYLE));
    }
    Collections.sort(list, new SortByName());
    System.out.println("=============================");
    for (Employee e : list) {
      System.out.println(ToStringBuilder.reflectionToString(e, ToStringStyle.MULTI_LINE_STYLE));
    }
  }
}
