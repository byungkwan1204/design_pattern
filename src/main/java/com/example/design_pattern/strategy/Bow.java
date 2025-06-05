package com.example.design_pattern.strategy;

public class Bow implements Weapon {

    @Override
    public void attack() {
        System.out.println("화살로 공격!");
    }
}
