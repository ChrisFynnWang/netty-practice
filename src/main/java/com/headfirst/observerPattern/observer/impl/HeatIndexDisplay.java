package com.headfirst.observerPattern.observer.impl;

import com.headfirst.observerPattern.observer.AbstractObserver;
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
public class HeatIndexDisplay extends AbstractObserver {

  public HeatIndexDisplay(Subject subject) {
    super(subject);
  }
}
