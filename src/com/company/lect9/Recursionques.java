package com.company.lect9;

public class Recursionques {

    public static void main(String[] args) {
        subsequence("","abc");

        permutation("","abc");
    }
    
    public static void subsequence(String processed, String unprocessed){
        
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        
        char ch= unprocessed.charAt(0);
        unprocessed=unprocessed.substring(1);
        
        subsequence(processed+ch,unprocessed);
        subsequence(processed,unprocessed);
    }

    public static void asciisubsequence(String processed, String unprocessed){

        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch= unprocessed.charAt(0);
        unprocessed=unprocessed.substring(1);

        asciisubsequence(processed+ch,unprocessed);
        asciisubsequence(processed+(int)ch,unprocessed);
        asciisubsequence(processed,unprocessed);
    }
    
    public static void permutation(String processed, String unprocessed){

        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch= unprocessed.charAt(0);
        unprocessed=unprocessed.substring(1);

        for (int i = 0; i <=processed.length() ; i++) {

            String first =processed.substring(0,i);
            String second=processed.substring(i);

            permutation(first+ch+second,unprocessed);
        }
        
    }

    public static void dice(String processed,int target){

        if(target==0){
            System.out.println(processed);
            return;
        }

        for (int i = 1; i <=6 &&i<=target ; i++){
            dice(processed+i,target-i);
        }
    }
}
