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
public class Extend extends Base {

    static {
        System.out.println("Extend static block");
    }

    {
        System.out.println("Extend constructor block");
    }

    public Extend() {
        System.out.println("Extend contructor");
    }

}
