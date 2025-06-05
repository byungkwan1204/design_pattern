package com.example.design_pattern.strategy;

public class Sword implements Weapon {

    @Override
    public void attack() {
        System.out.println("대검으로 공격!");
    }
}
