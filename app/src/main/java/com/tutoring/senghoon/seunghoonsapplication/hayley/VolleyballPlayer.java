package com.tutoring.senghoon.seunghoonsapplication.hayley;

public class VolleyballPlayer extends Athlete implements Player {

    interface VolleyballPlayerListener {
        void end(String name);
    }

    VolleyballPlayerListener volleyballPlayerListener;

    VolleyballPlayer(String name, String team, int imgSrc, VolleyballPlayerListener volleyballPlayerListener) {
        super(name, team, imgSrc);

        this.volleyballPlayerListener = volleyballPlayerListener;
    }

    @Override
    public void move() {
        System.out.println("점프");
        volleyballPlayerListener.end(name);
    }

    @Override
    public void stop() {
        System.out.println("Defend");
    }
}