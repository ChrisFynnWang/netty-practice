package com.wfan.effectivejava;

public class Singleton
{
    private final static Singleton singleton = new Singleton();

    private Singleton ()
    {
    }

    public static Singleton getInstance ()
    {
        return singleton;
    }
}
