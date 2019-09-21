package com.company.Lect10;

import java.util.Arrays;

public class Lexopermute {

    public static void main(String[] args) {
        String str ="abc";
        int fre[]=freq(str);
//        System.out.println(Arrays.toString(fre));

        permutation("",str.length(),fre);
    }

    public static void permutation(String processed, int length,int freq[]){

        if(length==0){
            System.out.println(processed);
            return;
        }

        for (int i = 0; i <freq.length ; i++) {
            if(freq[i]>0){

                freq[i]--;
                permutation(processed+(char)(i+'a'),length-1,freq);
                freq[i]++;
            }
        }
    }

    public static int[] freq(String str){

        int fre[]=new int[26];

        for (int i = 0; i <str.length() ; i++) {

            char ch= str.charAt(i);
            fre[ch-'a']++;
        }
        return fre;
    }
}
