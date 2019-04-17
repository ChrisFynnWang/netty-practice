package com.quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.SchedulerException;

/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/4/14
 * @Other:
 */
public class QuartzTask implements Job {

  @Override
  public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
    try {
      System.out.println("start to execute Task!" + jobExecutionContext.getScheduler().getSchedulerName() + "   " + jobExecutionContext.getTrigger().getName());
    } catch (SchedulerException e) {
      e.printStackTrace();
    }
  }
}
