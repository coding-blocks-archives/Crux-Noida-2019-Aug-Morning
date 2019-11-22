package com.company.Lec26;

public class diceDp {

    public static void main(String[] args) {
        System.out.println(dicecount(4,6));
        int target=4;
        long mem[] = new long[target+1];
//        System.out.println(dicecountdp(target,6,mem));
        System.out.println(dicecountItr(target,6,mem));
    }

    public static int dicecount(int target,int face){

        if(target==0){
            return 1;
        }
        int cnt=0;

        for (int i = 1; i <=face &&i<=target ; i++) {
            cnt+=dicecount(target-i,face);
        }

        return cnt;

        }

    public static long dicecountItr(int target,int face, long[] mem){

        mem[0]=1;

        for (int i =1 ; i <=target ; i++) {

            for (int j = 1; j <=face && j<=i ; j++) {

                mem[i]=mem[i]+mem[i-j];
            }

        }
        return mem[target];
    }



    public static int dicecountdp(int target,int face,Integer[] mem){

        if(target==0){
            return 1;
        }

        if(mem[target]!=null){
            return mem[target];
        }
        int cnt=0;

        for (int i = 1; i <=face &&i<=target ; i++) {
            cnt+=dicecount(target-i,face);
        }
        mem[target]=cnt;

        return mem[target];
    }



}

