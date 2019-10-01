package com.company.Lec12;

import java.lang.reflect.Array;

public class Human{

    String name;

    int balance;

//    static int balance=20000;

    public Human(Human old){
        this.balance=old.balance;
    }

    public Human(){
//        this.balance=20000;
        this(200);
        this.balance=10000;
    }

    public Human(int balance){
//        this.balance=balance;
        this("Anonymous",balance);
    }

    public Human(String name, int balance){
        this.balance=balance;
        this.name=name;
    }

    public int balance(){

        int t=this.balance/10;
        this.balance=this.balance-t;
        System.out.println("lut gaya me "+ balance);

        return balance;
    }

    public static void fest(){
        System.out.println("hurray hurray");
    }

    public void eat(){

        if(balance<1000){
            System.out.println("paise leke aa");
            return;
        }
        balance=balance-500;
        System.out.println("me khata hun");
    }
}
