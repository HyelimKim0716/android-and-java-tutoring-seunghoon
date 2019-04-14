package com.tutoring.senghoon.seunghoonsapplication.hayley;

public class SoccerPlayer extends Athlete implements Player {

    interface SoccerPlayerListener {
        void finish(String name);
    }


    String position;
    String skill;

    SoccerPlayerListener soccerPlayerListener;

    SoccerPlayer(String name, String position, String team, String skill, int imgSrc, SoccerPlayerListener soccerPlayerListener) {
        super(name, team, imgSrc);
        this.position = position;
        this.skill = skill;
        this.soccerPlayerListener = soccerPlayerListener;
    }

    @Override
    public void move() {
        System.out.println(name + "는 파워드리블하면서 달린다");
        System.out.println(name + "는 파워드리블하면서 달린다");
        System.out.println(name + "는 파워드리블하면서 달린다");
        System.out.println(name + "는 파워드리블하면서 달린다");
        System.out.println(name + "는 파워드리블하면서 달린다");
        System.out.println(name + "는 파워드리블하면서 달린다");

        soccerPlayerListener.finish(name);


    }

    @Override
    public void stop() {
        for (int i = 0; i <= 100; i++) {
            System.out.println(name + "은 움직임을 " + i + " 번 멈춘다");
        }



    }

    void kick() {
        System.out.println("감아차기");
    }

}
