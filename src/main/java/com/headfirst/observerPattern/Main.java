package com.headfirst.observerPattern;

import com.headfirst.observerPattern.observer.Observer;
import com.headfirst.observerPattern.observer.impl.CurrentConditionDisplay;
import com.headfirst.observerPattern.observer.impl.HeatIndexDisplay;
import com.headfirst.observerPattern.subject.Subject;
import com.headfirst.observerPattern.subject.impl.WeatherData;

/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/3/30
 * @Other:
 */
public class Main {

  public static void main(String[] args) {

    Subject subject = new WeatherData();
    Observer ccd = new CurrentConditionDisplay(subject);
    Observer hid = new HeatIndexDisplay(subject);
    subject.setMeasurements(1.5f, 2.0f, 3.0f);
  }
}
