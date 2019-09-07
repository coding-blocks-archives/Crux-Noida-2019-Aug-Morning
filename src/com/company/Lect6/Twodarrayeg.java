package com.company.Lect6;

import java.util.Scanner;

public class Twodarrayeg {

    public static void main(Stringeg[] args) {

        Scanner s= new Scanner(System.in);
        int[][] ar1= new int[2][2];

        int ar[][]={{1,2,3},{3,4,5},{6,7,8}};


        for (int i = 0; i <ar.length ; i++) {

            for (int j = 0; j <ar[i].length ; j++) {

                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }

//        for (int i = 0; i <ar.length ; i++) {
//
//            for (int j = 0; j <ar[i].length ; j++) {
//
//                ar[i][j]=s.nextInt();
//            }
//            System.out.println();
//        }

        horizontalwave(ar);
    }

    public static void horizontalwave(int ar[][]){

        for (int i = 0; i <ar.length ; i++) {

            if(i%2==0){

                for (int j = 0; j <ar[i].length ; j++) {
                    System.out.println(ar[i][j]);
                }
            }

            else{

                for (int j =ar[i].length-1; j>=0 ; j--) {
                    System.out.println(ar[i][j]);
                }
            }
        }
    }



}
