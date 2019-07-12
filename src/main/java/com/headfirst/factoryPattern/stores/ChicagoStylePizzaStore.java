package com.headfirst.factoryPattern.stores;

import com.headfirst.factoryPattern.factory.SimplePizzaFactory;
import com.headfirst.factoryPattern.pizzas.ChicagoStyleCheesePizza;
import com.headfirst.factoryPattern.pizzas.Pizza;

public class ChicagoStylePizzaStore extends PizzaStore {

    public ChicagoStylePizzaStore(SimplePizzaFactory factory) {
        super(factory);
    }

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        }
        return pizza;
    }
}
