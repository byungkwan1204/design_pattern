package com.example.design_pattern.strategy;

public class Character {

    private Weapon weapon;

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void actAttack() {
        if (weapon != null) {
            weapon.attack();
        } else {
            System.out.println("무기가 없습니다.");
        }
    }
}
