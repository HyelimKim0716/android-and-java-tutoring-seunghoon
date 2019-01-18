package com.tutoring.senghoon.seunghoonsapplication.hayley;

public class Pig extends Animal {

    Pig(String name, int legCount, String hairColor, int age) {
        super(name, legCount, hairColor, age);
    }

    @Override
    void singASong(String songName) {
        System.out.println(name + "는 " + songName + "을 꿀!꿀! 부른다네");
    }
}
