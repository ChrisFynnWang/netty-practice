package com.headfirst.factoryPattern.stores;

import com.headfirst.factoryPattern.pizzas.NYStyleCheesePizza;
import com.headfirst.factoryPattern.pizzas.Pizza;
import com.headfirst.factoryPattern.factory.SimplePizzaFactory;

public class NYStylePizzaStore extends PizzaStore {

    public NYStylePizzaStore(SimplePizzaFactory factory) {
        super(factory);
    }

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new NYStyleCheesePizza();
        }
        return pizza;
    }
}
