package com.example.design_pattern.decorator;

public class Espresso extends Beverage {

    @Override
    String getDescription() {
        return "에스프레소";
    }

    @Override
    int cost() {
        return 3000;
    }
}
