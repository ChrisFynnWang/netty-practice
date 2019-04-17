package com.headfirst.observerPattern.observer;

/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/3/30
 * @Other:
 */
public interface Observer {

  public void update(float temperature, float humidiy, float pressure);

}
