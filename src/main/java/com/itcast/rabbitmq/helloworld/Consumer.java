package com.itcast.rabbitmq.helloworld;

import com.itcast.rabbitmq.Constants;
import com.itcast.rabbitmq.util.ConnectionUtil;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.QueueingConsumer;
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
public class Consumer {

  public static void main(String[] args) throws IOException, InterruptedException {

    Connection connection = ConnectionUtil.getConnection();
    Channel channel = connection.createChannel();
    channel.queueDeclare(Constants.QUEUE_NAME, false, false, false, null);
    QueueingConsumer consumer = new QueueingConsumer(channel);
    channel.basicConsume(Constants.QUEUE_NAME, true, consumer);
    while (true) {
      Producer.produce();
      QueueingConsumer.Delivery delivery = consumer.nextDelivery();
      String message = new String(delivery.getBody());
      System.out.println("[x] Received '" + message + "'");
    }
  }
}
