package com.tutoring.senghoon.seunghoonsapplication.seunghoon;

public class Monkey extends Animal {

    Monkey(String name, String hairColor,int age) {
        super(name,2,hairColor,age);

    }
    @Override
    void singASong(String songName) {
        System.out.println(name + "는"+ songName + "을 으아앆아우끼우깎부른다" );
    }
}
