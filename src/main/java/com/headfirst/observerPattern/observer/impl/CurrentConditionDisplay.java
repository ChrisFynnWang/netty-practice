package com.headfirst.observerPattern.observer.impl;

import com.headfirst.observerPattern.subject.Subject;
import com.headfirst.observerPattern.observer.AbstractObserver;

/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/3/30
 * @Other:
 */
public class CurrentConditionDisplay extends AbstractObserver {

  public CurrentConditionDisplay(Subject subject) {
    super(subject);
  }
}
