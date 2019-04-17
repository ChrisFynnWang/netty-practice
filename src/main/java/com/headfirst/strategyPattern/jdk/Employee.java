package com.headfirst.strategyPattern.jdk;

/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/7/3
 * @Other:
 */
public class Employee implements Comparable<Employee> {

  private int id;

  private String name;

  public Employee(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public int compareTo(Employee e) {

    return this.getId() - e.getId();
  }
}
