package com.tutoring.senghoon.seunghoonsapplication.seunghoon;

public class SoccerPlayer extends Athlete implements Player{
    interface  SoccerPlayerListner {
        void finish(String name);
    }

    String position;
    String skill;
    SoccerPlayerListner soccerPlayerListner;

    SoccerPlayer(String name,String position,String team,String skill,int imgSrc, SoccerPlayerListner soccerPlayerListner) {
        super(name, team,imgSrc);
       this.position = position;
       this.skill = skill;
       this.soccerPlayerListner = soccerPlayerListner;
    }

    @Override
    public void move() {
        System.out.println(name+"는"+ "드리블한다.");
        soccerPlayerListner.finish(name);

    }

    @Override
    public void stop() {
        System.out.println(name +"는"+"움직임을 멈춘다.");
    }

    void kick() {
        System.out.println("감아차기");
    }

}
