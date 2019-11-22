package com.company.Lec26;

public class EditDistance {

    public static void main(String[] args) {

        System.out.println(Edit("","geekss"));
    }

    public static int Edit(String s1, String s2){


        if(s1.length()==0){
            return s2.length();
        }

        if(s2.length()==0){
            return s1.length();
        }

        if(s1.charAt(0)==s2.charAt(0)){

            return Edit(s1.substring(1),s2.substring(1));
        }
        else{

           return  1+Math.min(Math.min(Edit(s1.substring(1),s2),Edit(s1,s2.substring(1))),Edit(s1.substring(1),s2.substring(1)));
        }


    }
}
