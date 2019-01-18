package com.tutoring.senghoon.seunghoonsapplication.hayley;

public class Bird extends Animal {

    Bird(String name, int legCount, String hairColor, int age) {
        super(name, legCount, hairColor, age);
    }

    @Override
    void singASong(String songName) {
        System.out.println(name + "이 " + songName + "을 샤랄라하게 부른다");
    }

    void fly(String how) {
        System.out.println(name + how);
    }
}
