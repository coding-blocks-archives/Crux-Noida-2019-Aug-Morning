package com.company.Lect7;

public class recpec {


    public static void main(String[] args) {
        pd(4);
    }

    public static void pd(int n){

        if(n==0){
            return;
        }

        System.out.println(n);
        pd(n-1);
    }
}
