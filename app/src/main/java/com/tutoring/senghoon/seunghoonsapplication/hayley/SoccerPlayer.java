package com.tutoring.senghoon.seunghoonsapplication.hayley;

public class SoccerPlayer extends Athlete implements Player {
    String position;
    String skill;

    SoccerPlayer(String name, String position, String team, String skill, int imgSrc) {
        super(name, team, imgSrc);
        this.position = position;
        this.skill = skill;
    }

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
