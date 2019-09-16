package com.company.lect9;

import com.company.Lect5.Util;

public class Subrecursioneg {

    public static void main(String[] args) {
        pattern(4,0);
        pattern2(4,0);
    }

    public static void pattern(int row, int col){

        if(row==0){
            return;
        }

        if(row==col){
            System.out.println();
            pattern(row-1,0);
            return;
        }

        System.out.print("*");
        pattern(row,col+1);

    }

    public static void pattern2(int row, int col){

        if(row==0){
            return;
        }

        if(row==col){

            pattern2(row-1,0);
            System.out.println();
            return;
        }


        pattern2(row,col+1);
        System.out.print("*");
    }

    public static void bubblesort(int ar[],int row, int col){

        if(row==0){
            return;
        }

        if(row==col){

            bubblesort(ar,row-1,0);
            return;
        }

        if(ar[col]>ar[col+1]){
            Util.swap(ar,col,col+1);
        }

        bubblesort(ar,row,col+1);

    }
}
