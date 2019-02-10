package com.tutoring.senghoon.seunghoonsapplication.seunghoon;

public class Television implements Switch{

    @Override
    public void on() {
        System.out.println("텔레비젼이 켜졌다!");
    }
    @Override
    public void off() {
        System.out.println("텔레비젼이 꺼졌다..");
    }

}
