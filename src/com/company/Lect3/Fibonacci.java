package com.company.Lect3;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        int n=scan.nextInt();
        int f=0;
        int s=1;

        while(n>0){
            int t=f+s;
            f=s;
            s=t;
            n=n-1;
        }
        System.out.println(f);
    }
}
