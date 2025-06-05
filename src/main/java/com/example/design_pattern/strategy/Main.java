package com.example.design_pattern.strategy;

public class Main {

    public static void main(String[] args) {
        Character character = new Character();
        character.setWeapon(new Sword());
        character.actAttack();

        character.setWeapon(new Bow());
        character.actAttack();
    }
}
