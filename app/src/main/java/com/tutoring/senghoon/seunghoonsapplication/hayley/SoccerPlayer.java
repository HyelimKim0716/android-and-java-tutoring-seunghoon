package com.tutoring.senghoon.seunghoonsapplication.hayley;

public class SoccerPlayer implements Player {
    String name;

    @Override
    public void move() {
        System.out.println("파워드리블하면서 달린다");
    }

    @Override
    public void stop() {
        System.out.println("움직임을 멈춘다");
    }

    void kick() {
        System.out.println("감아차기");
    }

}
