package com.tutoring.senghoon.seunghoonsapplication.seunghoon;

public class Lion extends Animal {
    Lion(String name,String hairColor,int age,boolean isAdult,String maneColor ) {
        super(name, 4, hairColor, age);
        legCount = 4;
        this.isAdult = isAdult;
        this.maneColor = maneColor;
    }

    @Override
    String getMessage() {
        // name,    legCount,   hairColor,  age,    isAdult,    maneColor

        // simba,   4,        , yellow,     4,      false,      None
        // mufasa,  4           , Brown     46,     true,       redBrown
        // scar,    4,          darkBrown,  37,     true,       Black

        super.getMessage();     // name+","+legCount+","+hairColor+","+age

        return  name+","+legCount+","+hairColor+","+age+ isAdult + maneColor;
    }
    @Override
     void singASong(String songName) {
        System.out.println(name + "은" + songName + "을 뺴애액!부른다");



    }



    boolean isAdult;

    String maneColor;

}
