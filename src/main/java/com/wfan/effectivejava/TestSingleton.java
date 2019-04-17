package com.wfan.effectivejava;

public class TestSingleton
{
    public static void main (String[] args)
    {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println(instance1.equals(instance2));
        Math.abs(1);
        Singleton s = null;
        try
        {
            s = Singleton.class.newInstance();
            System.out.println(s);
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println(s);
        }

    }
}
