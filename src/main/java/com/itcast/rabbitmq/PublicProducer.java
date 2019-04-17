package com.itcast.rabbitmq;

import com.itcast.rabbitmq.Constants;
import com.itcast.rabbitmq.ExchangeType;
import com.itcast.rabbitmq.util.ConnectionUtil;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import java.io.IOException;
import org.junit.Test;

/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/4/6
 * @Other:
 */
public class PublicProducer {

  @Test
  public void helloWorldProduce() throws IOException {
    Connection connection = ConnectionUtil.getConnection();
    Channel channel = connection.createChannel();
    channel.queueDeclare(Constants.QUEUE_NAME, false, false, false, null);
    String message = "Hello World!";
    channel.basicPublish("", Constants.QUEUE_NAME, null, message.getBytes());
    System.out.println(" [x] Sent '" + message + "'");
    channel.close();
    connection.close();
  }

  @Test
  public void workProduce() throws IOException {
    Connection connection = ConnectionUtil.getConnection();
    Channel channel = connection.createChannel();
    channel.queueDeclare(Constants.QUEUE_NAME, false, false, false, null);
    String message = "Hello World!";
    for (int i = 0; i < 1000; i++) {
      channel.basicPublish("", Constants.QUEUE_NAME, null, (message + i).getBytes());
    }
    System.out.println(" [x] Sent '" + message + "'");
    channel.close();
    connection.close();
  }

  @Test
  public void publishProduce() throws IOException {
    Connection connection = ConnectionUtil.getConnection();
    Channel channel = connection.createChannel();
    channel.exchangeDeclare(Constants.EXCHANGE_NAME, ExchangeType.FANOUT.getType());
    String message = "Hello World!";
    channel.basicPublish(Constants.EXCHANGE_NAME, "", null, message.getBytes());
    System.out.println(" [x] Sent '" + message + "'");
    channel.close();
    connection.close();
  }

  @Test
  public void routeProduce() throws IOException {
    Connection connection = ConnectionUtil.getConnection();
    Channel channel = connection.createChannel();
    channel.exchangeDeclare(Constants.DIRECT_EXCHANGE_NAME, ExchangeType.DIRECT.getType());
    String message = "Hello World!";
    channel.basicPublish(Constants.DIRECT_EXCHANGE_NAME, Constants.UPDATE_ACTION, null,
        message.getBytes());
    channel.basicPublish(Constants.DIRECT_EXCHANGE_NAME, Constants.INSERT_ACTION, null,
        message.getBytes());
    channel.basicPublish(Constants.DIRECT_EXCHANGE_NAME, Constants.DELETE_ACTION, null,
        message.getBytes());
    System.out.println(" [x] Sent '" + message + "'");
    channel.close();
    connection.close();
  }

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
}
