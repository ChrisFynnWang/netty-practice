package com.headfirst.singletonPattern;

/**
 * @Author : Chris Wang
 * @Description :
 * @Date : 2019/7/12 9:10
 */
public class SingletonA {

    private static SingletonA singletonA;

    private SingletonA() {

    }

    public static SingletonA getInstance() {
        if (singletonA == null) {
            synchronized (SingletonA.class) {
                if (singletonA == null) {
                    singletonA = new SingletonA();
                }

            }
        }
        return singletonA;
    }
}
