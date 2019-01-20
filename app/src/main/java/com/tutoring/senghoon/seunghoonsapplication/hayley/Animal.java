package com.tutoring.senghoon.seunghoonsapplication.hayley;

public abstract class Animal {

    String name = null;

    int legCount;

    String hairColor;

    int age;



    Animal(String name, int legCount, String hairColor, int age) {
        this.name = name;
        this.hairColor = hairColor;
        this.age = age;
    }


    String getMessage() {
        return name + ", "
                + legCount + ", "
                + hairColor + ", "
                + age;
    }



    // returnType methodName(parameter1, parameter2, ...) {
    // ... do something
    // }
    void run(String how) {
        System.out.println(name + "는 "+ how + " 달린다");
    }

    void eat(String what) {
        System.out.println(name + "는 " + what + "을 먹는다");
    }

    // 함수
    // returnType methodName()
    void see(String what) {
        System.out.println(name + "는 " + what + "을 보다");
    }

    void walk(String how, String walk) {
        System.out.println(name + "는 " + how + walk);
    }

    abstract void singASong(String name);
}
