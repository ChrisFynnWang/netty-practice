package com.headfirst.factoryPattern.factory;

import com.headfirst.factoryPattern.pizzas.Pizza;
import com.headfirst.factoryPattern.pizzas.CheesePizza;
import com.headfirst.factoryPattern.pizzas.PepperoniPizza;
import com.headfirst.factoryPattern.pizzas.VeggiePizza;

public class SimplePizzaFactory {

    public Pizza createPizza(String type) {

        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
