package com.example.design_pattern.observer;

public class Main {

    public static void main(String[] args) {
        NewPublisher publisher = new NewPublisher();
        Observer alice = new Subscriber("Alice");
        Observer bob = new Subscriber("Bob");

        publisher.register(alice);
        publisher.register(bob);

        publisher.notifyObservers("디자인 패턴 강의가 올라왔습니다.");
    }
}
