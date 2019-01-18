package com.tutoring.senghoon.seunghoonsapplication.seunghoon;

public class Bird extends Animal {

    Bird(String name,int legCount,String hairColor,int age) {
        super(name,legCount,hairColor,age);
    }

    void fly(String fly) {
        System.out.println(name +"는"+ fly);
    }

    @Override
    void singASong(String songName) {
        System.out.println(name + "이"+ songName + "을 라ㅏ라라라ㅏ라라 부른다");
    }
}

