package com.springrabbitmq;

/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/4/6
 * @Other:
 */
public class Foo {

  public void listen(String foo) {
    System.out.println("消费者" + foo);
  }

}
