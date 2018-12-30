package com.tutoring.senghoon.seunghoonsapplication.hayley;

public class Animal {

    String name = null;

    int legCount;

    String hairColor;

    int age;

    // returnType methodName(parameter1, parameter2, ...) {
    // ... do something
    // }
    void run(String how) {
        System.out.println(name + "는 "+ how + " 달린다");
    }

    void eat(String name, String what) {
        System.out.println(name + "는 " + what + "을 먹는다");
    }

    void walk() {
        System.out.println(name + "는 걷는다");
    }

    void see() {
        System.out.println(name + "는 본다");
    }


}
