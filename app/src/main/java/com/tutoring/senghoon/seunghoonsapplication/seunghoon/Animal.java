package com.tutoring.senghoon.seunghoonsapplication.seunghoon;

public abstract class Animal {
    String name;

    int legCount;

    String hairColor;

    int age;

    String getMessage() {
        return name+","+legCount+","+hairColor+","+age;
    }

    Animal(String name, int legCount, String hairColor, int age) {
        this.name = name;
        this.legCount = legCount;
        this.hairColor = hairColor;
        this.age = age;
    }

    void run(String how) {
        System.out.println(name + "는" + how + "달린다아아앙ㅇ");
    }

    void eat(String what) {
        System.out.println(name + "는" + what + "먹는다");
    }

    void see(String what) {
        System.out.println(name + "는" + what + "본다");
    }

    void walk(String walk, String how) {
        System.out.println(name + "는" + how + walk);
    }

    abstract void singASong(String songName);

}
