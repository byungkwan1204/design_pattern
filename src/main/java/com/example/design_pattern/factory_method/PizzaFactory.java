package com.example.design_pattern.factory_method;

public class PizzaFactory {

    public Pizza createPizza(String type) {
        switch (type) {
            case "cheese":
                return new CheesePizza();

            case "pepperoni":
                return new PepperoniPizza();

            default:
                throw new IllegalArgumentException("Unknown type");
        }
    }
}
