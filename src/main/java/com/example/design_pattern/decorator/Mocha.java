package com.example.design_pattern.decorator;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    String getDescription() {
        return beverage.getDescription() + ", 모카";
    }

    @Override
    int cost() {
        return beverage.cost() + 500;
    }
}
