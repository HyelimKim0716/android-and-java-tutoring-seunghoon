package com.tutoring.senghoon.seunghoonsapplication.hayley;

public class Television implements Switch {

    @Override
    public void on() {
        System.out.println("텔레비젼이 켜졌습니다.");
    }

    @Override
    public void off() {
        System.out.println("텔레비젼이 꺼졌습니다.");
    }
}
