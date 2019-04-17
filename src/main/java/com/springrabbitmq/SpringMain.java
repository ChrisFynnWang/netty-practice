package com.springrabbitmq;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/4/6
 * @Other:
 */
public class SpringMain {

  public static void main(String[] args) throws InterruptedException {
    AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(
        "classpath:spring/rabbitmq-context.xml");
    RabbitTemplate template = ctx.getBean(RabbitTemplate.class);
    template.convertAndSend("hello World!");
    Thread.sleep(1000);
    ctx.destroy();
  }
}
