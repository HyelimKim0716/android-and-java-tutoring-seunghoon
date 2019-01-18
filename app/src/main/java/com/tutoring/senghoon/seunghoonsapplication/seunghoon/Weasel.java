package com.tutoring.senghoon.seunghoonsapplication.seunghoon;

public class Weasel extends Animal {

    Weasel(String name,String hairColor,int age,int legCount) {
        super(name,legCount,hairColor,age);


    }
    @Override
    void singASong(String songName) {
        System.out.println(name + "을 ㅎㄴ싄호ㅜ ㅐㄴㄱ하ㅣㅎ누ㅗㅜ냐"+songName+"부른다");
    }
}
