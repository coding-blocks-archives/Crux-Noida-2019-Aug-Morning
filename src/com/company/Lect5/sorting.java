package com.company.Lect5;

import java.util.Arrays;

public class sorting {

    public static void main(String[] args) {
        int ar[]={5,4,9,3,2,1};
        bubblesort(ar);
        System.out.println(Arrays.toString(ar));
    }

    public static void bubblesort(int ar[]){

        for (int i = 0; i <ar.length ; i++) {

            for (int j = 0; j <ar.length-i-1 ; j++) {

                if(ar[j]>ar[j+1]){

                    int temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }

//                Util.maxindex()

            }
        }
    }
}
