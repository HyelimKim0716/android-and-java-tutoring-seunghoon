package com.tutoring.senghoon.seunghoonsapplication.seunghoon;

public class BasketballPlayer extends Athlete implements Player {

    interface BasketballPlayerListener{
        void status(String name,String status);
    }
    BasketballPlayerListener basketballPlayerListener;
    BasketballPlayer(String name,String team,int imgSrc,BasketballPlayerListener basketballPlayerListener){
        super(name,team,imgSrc);
    this.basketballPlayerListener = basketballPlayerListener;
    }
    @Override
    public void move() {
        System.out.println(name+"움직인다아..");
        basketballPlayerListener.status(name, "움직임");
    }
    @Override
    public void stop() {
        System.out.println(name+"멈췄다");
        basketballPlayerListener.status(name,"머엄춤");
    }
}
