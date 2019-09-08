package com.company.Lect7;

import java.util.Scanner;

public class lect7 {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();

        System.out.println(sqrt(n));
    }

    public static int sqrt(int n){

        int start=0;
        int end=n;
        int ans=0;

        while(start<=end){

            int mid= (start+end)/2;

            if(mid*mid==n){
                return mid;
            }

            else if(mid*mid<n){
                ans=mid;
                start=mid+1;
            }

            else{
                end=mid-1;
            }
        }
        return ans;
    }
}
