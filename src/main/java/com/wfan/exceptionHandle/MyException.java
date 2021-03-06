package com.wfan.exceptionHandle;

/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/3/20
 * @Other:
 */
public class MyException {

    public static void main(String[] args) {

        Invoker.m1();
        Invoker.m2();
    }

}

class Foo {

    public static boolean m()

    {
//取得当前栈信息
        StackTraceElement[] sts = new Throwable().getStackTrace();
//检查是否是m1方法调用
        for (StackTraceElement st : sts) {
            if (st.getMethodName().equals("m1")) {
                return true;
            }
        }
        return false;
    }
}

//调用者
class Invoker {

    //该方法打印出true
    public static void m1()

    {
        System.out.println(Foo.m());
    }

    //该方法打印出false
    public static void m2()

    {
        System.out.println(Foo.m());
    }
}