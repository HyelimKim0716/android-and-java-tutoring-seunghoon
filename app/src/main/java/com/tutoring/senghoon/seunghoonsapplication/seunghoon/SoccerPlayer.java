package com.tutoring.senghoon.seunghoonsapplication.seunghoon;

public class SoccerPlayer implements Player{
    String name;

    @Override
    public void move() {
        System.out.println("드리블한다.");
    }

    @Override
    public void stop() {
        System.out.println("움직임을 멈춘다.");
    }

    void kick() {
        System.out.println("감아차기");
    }

}
