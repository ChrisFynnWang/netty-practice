package com.headfirst.observerPattern.subject;

import com.headfirst.observerPattern.observer.Observer;

/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/3/30
 * @Other:
 */
public interface Subject {

  void registerObserver(Observer observer);

  void removeObserver(Observer observer);

  void notifyObservers();

  void measurementsChanged();

  void setMeasurements(float temperature, float humidiy, float pressure);

  void setChanged();

  void clearChanged();

  boolean hasChanged();

}
