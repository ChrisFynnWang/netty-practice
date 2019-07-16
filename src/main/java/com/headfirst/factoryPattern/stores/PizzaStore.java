package com.headfirst.factoryPattern.stores;

import com.headfirst.factoryPattern.factory.SimplePizzaFactory;
import com.headfirst.factoryPattern.pizzas.Pizza;

public abstract class PizzaStore {

    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public final Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    abstract Pizza createPizza(String type);
}
