package com.tutoring.senghoon.seunghoonsapplication.seunghoon;

public class Car {
     String  color;  //null != ""
     int speed;
     int wheel;
     int window;
     boolean isBreak;


     void speedUp() {
         speed = speed + 10;
     }


     void speedDown() {
         speed -= 10;
     }
}
