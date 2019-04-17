package com.quartz;

import java.util.Date;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.SimpleTrigger;
import org.quartz.impl.StdSchedulerFactory;

/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/4/14
 * @Other:
 */
public class QuartzDemo {

  public static void main(String[] args) throws SchedulerException {

    StdSchedulerFactory stdSchedulerFactory = new StdSchedulerFactory();
    Scheduler scheduler = stdSchedulerFactory.getScheduler();

    JobDetail jobDetail = new JobDetail("helloworld", Scheduler.DEFAULT_GROUP, QuartzTask.class);
    SimpleTrigger simpleTrigger = new SimpleTrigger("simpleTrigger", Scheduler.DEFAULT_GROUP);
    simpleTrigger.setStartTime(new Date(System.currentTimeMillis()));
    simpleTrigger.setRepeatInterval(5000);
    simpleTrigger.setRepeatCount(10);
    scheduler.scheduleJob(jobDetail, simpleTrigger);
    scheduler.start();
  }
}
