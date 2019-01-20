package com.tutoring.senghoon.seunghoonsapplication.hayley;

public class Lion extends Animal {

    boolean isAdult;

    String maneColor;

    Lion(String name, String hairColor, int age, boolean isAdult, String maneColor) {
        super(name, 4, hairColor, age);
        this.isAdult = isAdult;
        this.maneColor = maneColor;
    }

    @Override
    String getMessage() {
        return super.getMessage() + ", "
                + isAdult + ", "
                + maneColor;
    }

    @Override
    void singASong(String songName) {
        System.out.println(name + "은 " + songName + "을 무섭게 부른다");
    }

}
