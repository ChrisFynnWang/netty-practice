package com.itcast.rabbitmq.route;

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
public class WebDirect {

  public static void main(String[] args) throws IOException, InterruptedException {

    Connection connection = ConnectionUtil.getConnection();
    Channel channel = connection.createChannel();
    channel.queueDeclare(Constants.QUEUE_WEB_DIRECT, false, false, false, null);
    channel.queueBind(Constants.QUEUE_WEB_DIRECT, Constants.DIRECT_EXCHANGE_NAME, Constants.INSERT_ACTION);
    channel.queueBind(Constants.QUEUE_WEB_DIRECT, Constants.DIRECT_EXCHANGE_NAME, Constants.UPDATE_ACTION);
    channel.queueBind(Constants.QUEUE_WEB_DIRECT, Constants.DIRECT_EXCHANGE_NAME, Constants.DELETE_ACTION);
    channel.basicQos(1);
    QueueingConsumer consumer = new QueueingConsumer(channel);
    channel.basicConsume(Constants.QUEUE_WEB_DIRECT, false, consumer);
    while (true) {
      QueueingConsumer.Delivery delivery = consumer.nextDelivery();
      String message = new String(delivery.getBody());
      System.out.println("[x] Received '" + message + "'");
      //返回确认状态
      channel.basicAck(delivery.getEnvelope().getDeliveryTag(), false);
    }
  }

}
