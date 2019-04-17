package com.itcast.rabbitmq;

/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/4/6
 * @Other:
 */
public enum ExchangeType {

  TOPIC("topic"), FANOUT("fanout"), DIRECT("direct"), headers("HEADERS");
  private String type;
  ExchangeType(String type) {
    this.type = type;
  }

  public String getType() {
    return type;
  }
}
