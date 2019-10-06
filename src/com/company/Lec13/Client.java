package com.company.Lec13;

import com.company.Lec14.Arraylist;

import java.util.ArrayList;

public class Client {

    public static void main(String ...args) {


       Engine engine =new PetrolEngine();
        System.out.println(engine.accspeed);
        engine.start();
        engine.stop();
        engine.accelerate();

//        System.out.println(sum("hello",1,2,3,4,5,5,7,788,8,8));
//
    }

    public static int sum(String h,int ...ar){

        int s=0;
        for (int i = 0; i <ar.length ; i++) {
            s=s+ar[i];
        }
        return s;
    }
}
