package com.company.Lect5;

import java.util.Arrays;

public class Util {

    public static void main(String[] args) {

        int ar[]={1,2,9,3,4,5};

        System.out.println(Arrays.toString(ar));
        swap(ar);
        System.out.println(Arrays.toString(ar));

        System.out.println(maxindex(ar));

    }

    public static void swap(int[] ar){

        int temp=ar[1];
        ar[1]=ar[2];
        ar[2]=temp;
    }

    public static void inc(int[] ar){

        for (int i = 0; i <ar.length ; i++) {

            ar[i]=ar[i]+2;
        }
    }

    public static int max(int[] ar){

        int max=ar[0];

        for (int i = 1; i <ar.length ; i++) {

            if(ar[i]>max){
                max=ar[i];
            }
        }
        return max;
    }

    public static int maxindex(int[] ar){

        int max=0;

        for (int i = 1; i <ar.length ; i++) {

            if(ar[max]<ar[i]){
                max = i;
            }
        }
        return max;
    }
}
