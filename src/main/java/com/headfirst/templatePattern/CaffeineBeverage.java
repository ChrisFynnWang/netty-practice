package com.headfirst.templatePattern;

/**
 * @Author : Chris Wang
 * @Description :
 * @Date : 2019/7/22 8:40
 */
public abstract class CaffeineBeverage {

    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
        hook();
    }

    abstract void brew();

    abstract void addCondiments();

    public final void boilWater() {
        System.out.println("Boiling water!!");
    }

    public final void pourInCup() {
        System.out.println("Pouring into cup");
    }

    void hook() {

    }

    boolean customerWantsCondiments() {

        return true;
    }

}
