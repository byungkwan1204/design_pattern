package com.example.design_pattern.factory_method;

public class CheesePizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("치즈 피자 준비 중...");
    }
}
