package com.company.Lec13;

 public class Engine {

    protected int accspeed=3;

    public void start(){
        System.out.println("I start like a generic engine");
    }

    public void stop(){
        System.out.println("I stop like a generic engine");
    }

//    public abstract void fun();

    public void accelerate(){
        System.out.println("I accelerate like a generic engine"+accspeed);
    }

    public void accelerate(int ac){
        System.out.println("hello");
    }
}
