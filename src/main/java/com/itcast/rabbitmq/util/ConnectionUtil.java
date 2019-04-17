package com.itcast.rabbitmq.util;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import java.io.IOException;

/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/4/6
 * @Other:
 */
public class ConnectionUtil {

  //获取一个连接
  public static Connection getConnection() throws IOException {

    ConnectionFactory factory = new ConnectionFactory();
    factory.setHost("localhost");
    factory.setPort(5672);
    factory.setVirtualHost("/chris");
    factory.setUsername("chris");
    factory.setPassword("chris");

    Connection connection = factory.newConnection();
    return connection;
  }


}
