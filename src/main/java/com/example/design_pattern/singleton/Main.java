package com.example.design_pattern.singleton;

public class Main {

    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        s1.showMessage();               // 싱긅톤 인스턴스 사용 중...
        System.out.println(s1==s2);     // true
    }
}
