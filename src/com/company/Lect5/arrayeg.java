package com.company.Lect5;

import java.util.Scanner;

public class arrayeg {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int[] ar = new int[5];

        //custom array
        int ar1[]= {1,2,3,5,6};

        for (int i = 0; i <ar.length ; i++) {
            ar[i]=s.nextInt();
        }

        for (int i = 0; i <ar.length ; i++) {

            System.out.println(ar[i]);
        }
    }
}
