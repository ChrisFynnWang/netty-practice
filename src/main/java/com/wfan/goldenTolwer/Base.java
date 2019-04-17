package com.wfan.goldenTolwer;
/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/3/8
 * @Other:
 */
public class Base {

    static {
        System.out.println("Base static block");
    }
    {
        System.out.println("Base constructor block");
    }
    public Base() {
        System.out.println("Base constructor");
    }
}
