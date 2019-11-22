package com.company.Lec26;

public class LCS {


    public static void main(String[] args) {

        System.out.println(LCS("abcdef","abdc"));
    }

    public static int LCS(String s1, String s2){
        if(s1.length()==0 || s2.length()==0){
            return 0;
        }

        if(s1.charAt(0)==s2.charAt(0)){

            return 1+LCS(s1.substring(1),s2.substring(1));
        }

        else{

            return Math.max(LCS(s1.substring(1),s2),LCS(s1,s2.substring(1)));
        }


    }
}
