package com.itcast.rabbitmq.publish;

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
public class Search {

  public static void main(String[] args) throws IOException, InterruptedException {

    Connection connection = ConnectionUtil.getConnection();
    Channel channel = connection.createChannel();
    channel.queueDeclare(Constants.QUEUE_SEARCH, false, false, false, null);
    channel.queueBind(Constants.QUEUE_SEARCH, Constants.EXCHANGE_NAME, "");
    channel.basicQos(1);
    QueueingConsumer consumer = new QueueingConsumer(channel);
    channel.basicConsume(Constants.QUEUE_SEARCH, false, consumer);
    while (true) {
      QueueingConsumer.Delivery delivery = consumer.nextDelivery();
      String message = new String(delivery.getBody());
      System.out.println("[x] Received '" + message + "'");
      //返回确认状态
      channel.basicAck(delivery.getEnvelope().getDeliveryTag(), false);
    }
  }
}
