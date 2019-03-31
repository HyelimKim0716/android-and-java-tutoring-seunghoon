package com.tutoring.senghoon.seunghoonsapplication.seunghoon;

public class SoccerPlayer extends Athlete implements Player{
    String position;
    String skill;

    SoccerPlayer(String name,String position,String team,String skill,int imgSrc) {
        super(name, team,imgSrc);
       this.position = position;
       this.skill = skill;
    }

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
