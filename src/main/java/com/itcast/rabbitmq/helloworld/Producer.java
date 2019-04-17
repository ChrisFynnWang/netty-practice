package com.itcast.rabbitmq.helloworld;

import com.itcast.rabbitmq.Constants;
import com.itcast.rabbitmq.util.ConnectionUtil;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
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
public class Producer {

  public static void produce() throws IOException {
    Connection connection = ConnectionUtil.getConnection();
    Channel channel = connection.createChannel();
    channel.queueDeclare(Constants.QUEUE_NAME, false, false, false, null);
    String message = "Hello World!";
    channel.basicPublish("", Constants.QUEUE_NAME, null, message.getBytes());
    System.out.println(" [x] Sent '" + message + "'");
    channel.close();
    connection.close();
  }

  public static void main(String[] args) throws IOException {

    Connection connection = ConnectionUtil.getConnection();
    Channel channel = connection.createChannel();
    channel.queueDeclare(Constants.QUEUE_NAME, false, false, false, null);
    String message = "Hello World!";
    channel.basicPublish("", Constants.QUEUE_NAME, null, message.getBytes());
    System.out.println(" [x] Sent '" + message + "'");
    channel.close();
    connection.close();
  }
}
