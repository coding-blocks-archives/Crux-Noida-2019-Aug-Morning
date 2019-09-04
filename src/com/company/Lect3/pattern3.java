package com.company.Lect3;

import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        int n=s.nextInt();

        int row=1;
        int vmir=1;

        while(vmir<=2*n-1){

           int hmir=1;
           int col=1;

           while(hmir<=2*n-1){

               if(col<=row){
                   System.out.print("*");
               }
               else{
                   System.out.print(" ");
               }
               if(hmir<n){
                   col=col+1;
               }
               else{
                   col=col-1;
               }
               hmir=hmir+1;
           }

            System.out.println();

            if(vmir<n){
                row=row+1;
            }
            else{
                row=row-1;
            }
           vmir =vmir+1;
        }
    }
}
