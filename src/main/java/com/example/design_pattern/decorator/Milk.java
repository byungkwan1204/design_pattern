package com.example.design_pattern.decorator;

public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    String getDescription() {
        return beverage.getDescription() + ", 우유";
    }

    @Override
    int cost() {
        return beverage.cost() + 300;
    }
}
