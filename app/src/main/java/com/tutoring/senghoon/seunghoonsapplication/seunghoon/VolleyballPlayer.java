package com.tutoring.senghoon.seunghoonsapplication.seunghoon;

public class VolleyballPlayer extends Athlete implements Player {
interface  VolleyballPlayerListener {
    void end(String name);
}
    VolleyballPlayerListener volleyballPlayerListener;
    VolleyballPlayer(String name, String team,int imgSrc, VolleyballPlayerListener volleyballPlayerListener) {
        super(name, team,imgSrc);
        this.volleyballPlayerListener = volleyballPlayerListener;
    }

    @Override
    public void move() {
       System.out.println(name+"은 점프한당");
       volleyballPlayerListener.end(name);
    }
    @Override
    public void stop(){
        System.out.println(name+"은 defend");
    }
}

