package com.wfan.log;

import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/3/28
 * @Other:
 */
public class LogOutput {


  public static void main(String[] args) {
    Logger LOGGER = LoggerFactory.getLogger(LogOutput.class);
//    BasicConfigurator.configure();
//    System.setProperty("log4j.configuration", "com/wfan/log/log4j.properties");
    System.out.println(LOGGER.isDebugEnabled());
    System.out.println(LOGGER.isInfoEnabled());
    LOGGER.debug("11");
    LOGGER.info("11");
    LOGGER.error("11");
    LOGGER.warn("11");
  }

}
