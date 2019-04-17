package com.wfan.apache;

/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/3/25
 * @Other:
 */
public class User {

  private String name;
  private int ages;

  public User() {
  }

  public User(String name, int ages) {
    this.name = name;
    this.ages = ages;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return ages;
  }

  public void setAge(int age) {
    this.ages = age;
  }
}
