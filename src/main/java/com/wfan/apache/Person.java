package com.wfan.apache;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/3/25
 * @Other:
 */
public class Person {

  private String name;
  private int age;

  public Person() {
  }

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
  /*public String toString(){
    ToStringBuilder.setDefaultStyle(ToStringStyle.SIMPLE_STYLE);
    return ToStringBuilder.reflectionToString(this);
  }*/

  public String toString(){

    return new ToStringBuilder(this).append("姓名", name).append("年龄", age).toString();
  }

}
