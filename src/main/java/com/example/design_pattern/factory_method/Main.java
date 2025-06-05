package com.example.design_pattern.factory_method;

public class Main {

    public static void main(String[] args) {

        PizzaFactory factory = new PizzaFactory();
        Pizza pizza = factory.createPizza("cheese");
        pizza.prepare();    // 치즈 피자 준비중 ...
    }
}
