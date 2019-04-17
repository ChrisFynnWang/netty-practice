package com.itcast.rabbitmq.work;

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
public class Consumer1 {

  public static void main(String[] args) throws IOException, InterruptedException {

    Connection connection = ConnectionUtil.getConnection();
    Channel channel = connection.createChannel();
    channel.queueDeclare(Constants.QUEUE_NAME, false, false, false, null);
    //同一時刻服务器只会发条消息给消费者
    channel.basicQos(1);
    QueueingConsumer consumer = new QueueingConsumer(channel);
    channel.basicConsume(Constants.QUEUE_NAME, false, consumer);
    int j = 1;
    while (true) {
      QueueingConsumer.Delivery delivery = consumer.nextDelivery();
      String message = new String(delivery.getBody());
      System.out.println(j + " [x] Received '" + message + "'");
      //返回确认状态
      Thread.sleep(10);
      channel.basicAck(delivery.getEnvelope().getDeliveryTag(), false);
      j++;
    }
  }
}
