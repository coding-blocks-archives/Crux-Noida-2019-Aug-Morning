package com.company.Lect8;

public class Recursioneg {

    public static void main(String[] args) {

        int ar[]={2,3,4,5,1};
        System.out.println(fact(5));

        System.out.println(fibo(4));

        System.out.println(find(ar,4,0));

        System.out.println(sorted(ar,0));
    }

    public static int fact(int n){

        if(n==0){
            return 1;
        }

        return n*fact(n-1);
    }

    public static int fibo(int n){

        if(n<2){
            return n;
        }

        return fibo(n-1)+fibo(n-2);
    }

    public static boolean find(int ar[],int element,int index){

        if(index==ar.length){
            return false;
        }

        if(ar[index]==element){
            return true;
        }
        return find(ar,element,index+1);
    }

    public static boolean sorted(int ar[],int index){

        if(index==ar.length-1){
            return true;
        }

        if(ar[index]>ar[index+1]){
            return false;
        }
        return sorted(ar,index+1);
    }
}
