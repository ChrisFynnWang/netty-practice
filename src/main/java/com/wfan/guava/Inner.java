package com.wfan.guava;

/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/3/25
 * @Other:
 */
public class Inner {

  private String msg;

  private Inner(Inner inner) {

  }

  private Inner(String msg) {
    this.msg = msg;
  }

  public static Inner on(String str) {
    return new Inner(str);
  }

  public Inner withMsg() {

    return new Inner(this) {

      @Override
      public void print() {
        System.out.println(msg + " appendTo");
      }
    };
  }

  public void print() {
    System.out.println("actually appendTo");
  }

}
