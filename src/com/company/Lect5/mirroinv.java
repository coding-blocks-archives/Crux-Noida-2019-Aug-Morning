package com.company.Lect5;

import java.util.Scanner;

public class mirroinv {

    public static void main(String[] args) {

        Scanner s =new Scanner(System.in);

        int n=s.nextInt();

        int place=1;

        int mir=0;

        while(n!=0){

            int val= n%10;
            n=n/10;

            mir= (int)(mir+place*Math.pow(10,val-1));

            place=place+1;
        }

        System.out.println(mir);
    }
}
