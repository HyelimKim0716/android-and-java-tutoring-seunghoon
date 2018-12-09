package com.tutoring.senghoon.seunghoonsapplication.hayley;

public class Car {

    String color;   // null != ""

    int speed;

    int wheel;

    int window;

    boolean isBreak;

    void speedUp() {
        speed += 10;

        if (speed > 240) {
            speed = 240;
        }
    }

    void speedDown() {
        speed -= 10;

        if (speed < 0)
            speed = 0;
    }
}
