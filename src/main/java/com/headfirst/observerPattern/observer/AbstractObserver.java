package com.headfirst.observerPattern.observer;

import com.headfirst.observerPattern.display.DisplayElement;
import com.headfirst.observerPattern.subject.Subject;

/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/3/30
 * @Other:
 */
public class AbstractObserver implements Observer, DisplayElement {


  private float temperature;

  private float humidiy;

  private float pressure;

  private Subject subject;

  public AbstractObserver(Subject subject) {

    this.subject = subject;
    subject.registerObserver(this);
  }

  public void update(float temperature, float humidiy, float pressure) {

    this.temperature = temperature;
    this.humidiy = humidiy;
    this.pressure = pressure;
    display();
  }

  public void display() {

    System.out.println("[" + this.getClass().getSimpleName() +
        "]  temperature : " + temperature + " humidity : " + humidiy + " pressure : " + pressure);
  }
}
