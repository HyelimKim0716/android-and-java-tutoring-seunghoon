package com.tutoring.senghoon.seunghoonsapplication.seunghoon;

public class Pig extends Animal {

    Pig(String name,String hairColor,int age,int legCount) {
        super(name,legCount,hairColor,age);

    }
    @Override
    void singASong(String songName) {
        System.out.println(name+"을 꿀꿀꿀꿀꾸르르으으으"+ songName + "부른다");
    }
}
