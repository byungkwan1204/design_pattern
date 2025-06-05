package com.example.design_pattern.observer;

public class Subscriber implements Observer {

    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(this.name + "님 새 소식: " + message);
    }
}
