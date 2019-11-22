package com.company.Lec26;

public class Fibo {

    public static void main(String[] args) {
        System.out.println(fibo(5));
        int n=5;
        Integer mem[]= new Integer[n+1];
        System.out.println(fiborecDp(n, mem));
    }

    private static int fiborecDp(int n, Integer[] mem) {

        if(n<2){
            return n;
        }

        if(mem[n]!=null){
            return mem[n];
        }


        mem[n]= fiborecDp(n-1,mem)+fiborecDp(n-2,mem);

       return mem[n];
    }

    public static int fibo(int n){

        if(n<2){
            return n;
        }

        return fibo(n-1)+fibo(n-2);
    }

    public static long fiboItrdp(int n, long mem[]){

        mem[0]=0;
        mem[1]=1;

        for (int i = 2; i <n ; i++) {

            mem[i]=mem[i-1]+mem[i-2];
        }
        return mem[n];
    }
}
