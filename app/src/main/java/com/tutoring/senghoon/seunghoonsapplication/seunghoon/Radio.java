package com.tutoring.senghoon.seunghoonsapplication.seunghoon;

public class Radio implements Switch{

    @Override
   public void on() {
        System.out.println("Radio is on!");
    }
    @Override
    public void off() {
        System.out.println("Radio is off");
    }
}
