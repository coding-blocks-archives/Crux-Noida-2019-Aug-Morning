package com.company.Lec15;

public class bitmask {

    public static void main(String[] args) {
        oddeven(5);
        System.out.println(setbit(11,2));
        System.out.println(magicno(5));
    }

    public static void oddeven(int n){

        if((n&1)==1){
            System.out.println("no. is odd");
        }
        else{
            System.out.println("no. is even");
        }
    }

    public static void unique(int ar[]){

        int n=ar[0];

        for (int i = 1; i <ar.length ; i++) {
            n=n^ar[i];
        }

        System.out.println(n);
    }


    public static int setbitcount(int n){
        int cnt=0;
        while(n!=0){
            if((n&1)==1){
                cnt++;
            }
            n=n>>1;
        }
        return cnt;
    }

    public static int setbit(int n, int i){

        int mask= 1<<i;

        return (n|mask);
    }


    public static int offbit(int n, int i){

        int mask= ~(1<<i);
        return (n & mask);
    }


// Incredible hulk problem same as bitcount problem

// Subsequence problem discussed

// 2 Unique no. problem discussed

   public static int magicno(int n){

        int pow=1;
        int res=0;

        while(n!=0){

            pow=pow*5;

            if((n&1)==1){
                res=res+pow;
            }
            n=n>>1;
        }
        return res;
    }

}
