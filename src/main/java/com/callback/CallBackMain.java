package com.callback;

import java.util.concurrent.Executor;

/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/4/15
 * @Other:
 */
public class CallBackMain {


  public <T> T execute(Function<T> fun) {

    return fun.callback();
  }

  public String get(String value) {

    return this.execute(new Function<String>() {
      @Override
      public String callback() {
        System.out.println("gigigigigg");
        return null;
      }
    });
  }

  public static void executor(Execute execute) {
    execute.execute();
  }

  public static void main(String[] args) {

    CallBackMain.executor(new Execute() {
      @Override
      public void execute() {
        System.out.println("gogogogoogogo");
      }
    });
  }
}
