package com.company.Lect7;

public class Stringeg {


    public static void main(String[] args) {
        String s="Hello";

        System.out.println(s.charAt(0));

        for (int i = 0; i <s.length() ; i++) {
            System.out.println(s.charAt(i));
        }

        System.out.println(s.substring(1,4));
        substrings(s);

        System.out.println(pallindrome("aba"));

        s.indexOf("H");
    }


    public static void substrings(String s){

        for (int i = 0; i <=s.length() ; i++) {

            for (int j = i+1; j <=s.length() ; j++) {

                System.out.println(s.substring(i,j));
            }
        }
    }

    public static boolean pallindrome(String s){

       int start=0;
       int end=s.length()-1;

       while(start<end){

           if(s.charAt(start)!=s.charAt(end)){
               return false;
           }
           else{
               start++;
               end--;
           }
       }
        return true;
    }
}
