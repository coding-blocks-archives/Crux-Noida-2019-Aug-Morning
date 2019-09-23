package com.company.lect11;

import java.util.Arrays;

public class quicksort {


    public static void main(String[] args) {

        int ar[] ={1,9,2,3,6,5,0};
        quick(ar,0, ar.length);
        System.out.println(Arrays.toString(ar));
    }

    public static void quick(int[] nums,int start,int end){
        if(end<=start){
            return;
        }

        int pivot=end-1;

        pivot=swap(nums,start,pivot);
        quick(nums,0,pivot);
        quick(nums,pivot+1,end);

    }

    public static int swap(int[] ar,int start, int pivot){

//        int i=start;
        int j=start;

        for (int i = start; i <pivot ; i++) {

            if(ar[i]<ar[pivot]){
                int temp=ar[i];
                ar[i]=ar[j];
                ar[j]=temp;

                j++;
            }
        }
        int temp=ar[pivot];
        ar[pivot]=ar[j];
        ar[j]=temp;

        return j;
    }
}
