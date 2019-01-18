package com.tutoring.senghoon.seunghoonsapplication.hayley;

public class Weasel extends Animal {



    Weasel(String name, int legCount, String hairColor, int age) {
        super(name, legCount, hairColor, age);
    }

    @Override
    void singASong(String songName) {
        System.out.println(name + "은 " +  songName + "을 부른다");
    }
}
