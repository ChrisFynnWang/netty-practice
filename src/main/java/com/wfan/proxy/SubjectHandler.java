package com.wfan.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import javax.swing.Popup;

/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/3/15
 * @Other:
 */
public class SubjectHandler implements InvocationHandler {

    private Subject subject;

    public SubjectHandler(Subject subject) {
        this.subject = subject;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("前处理");
        Object object = method.invoke(subject, args);
        System.out.println("后处理");
        return object;
    }
}
