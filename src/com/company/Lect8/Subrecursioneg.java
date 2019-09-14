package com.company.Lect8;

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
}
