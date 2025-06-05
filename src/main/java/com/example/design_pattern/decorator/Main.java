package com.example.design_pattern.decorator;

public class Main {

    public static void main(String[] args) {

        Beverage beverage = new Espresso(); // 에스프레소
        beverage = new Mocha(beverage);     // 모카 추가
        beverage = new Milk(beverage);      // 우유 추가
        beverage = new Milk(beverage);      // 우유 한번 더 추가

        System.out.println(beverage.getDescription());
        System.out.println("가격: " + beverage.cost());
    }
}
