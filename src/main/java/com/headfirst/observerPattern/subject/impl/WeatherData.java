package com.headfirst.observerPattern.subject.impl;

import com.headfirst.observerPattern.observer.Observer;
import com.headfirst.observerPattern.subject.Subject;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/3/30
 * @Other:
 */
public class WeatherData implements Subject {

  private List<Observer> observers;

  private float temperature;

  private float humidiy;

  private float pressure;

  private boolean changed;

  public WeatherData() {
    observers = new ArrayList();
  }

  @Override
  public void registerObserver(Observer observer) {
    if (observer != null) {
      observers.add(observer);
    }
  }

  @Override
  public void removeObserver(Observer observer) {
    if (observers.indexOf(observer) >= 0) {
      observers.remove(observer);
    }
  }

  @Override
  public void notifyObservers() {
    if(changed){
      for (int i = 0; i < observers.size(); i++) {
        observers.get(i).update(temperature, humidiy, pressure);
      }
    }
  }

  public void measurementsChanged() {
    notifyObservers();
  }

  public void setMeasurements(float temperature, float humidiy, float pressure) {
    this.temperature = temperature;
    this.humidiy = humidiy;
    this.pressure = pressure;
    measurementsChanged();
  }

  @Override
  public void setChanged() {
    changed = true;
  }

  @Override
  public void clearChanged() {
    changed = false;
  }

  @Override
  public boolean hasChanged() {

    return changed;
  }
}
