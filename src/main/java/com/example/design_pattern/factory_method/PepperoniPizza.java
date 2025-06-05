package com.example.design_pattern.factory_method;

public class PepperoniPizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("페페로니 피자 준비 중...");
    }
}
