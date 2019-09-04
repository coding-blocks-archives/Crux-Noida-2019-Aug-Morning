package com.company.Lect4;

public class swap {

    public static void main(String[] args) {

        int a=2;
        int b=3;
        swap(a,b);

        System.out.println(a+" "+b);

        System.out.println(swap(a,b));

        System.out.println(a+" "+b);


    }

    public static int swap(int a ,int b){

        int t=a;
        a=b;
        b=t;

        return a;
    }
}
