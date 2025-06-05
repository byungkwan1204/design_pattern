package com.example.design_pattern.singleton;

public class Singleton {

    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {

        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }

    public void showMessage() {
        System.out.println("싱글톤 인스턴스 사용 중");
    }
}
