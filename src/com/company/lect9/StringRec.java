package com.company.lect9;

public class StringRec {

    public static void main(String[] args) {

    }

    public static void skipi(String processed,String unprocessed){

        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch=unprocessed.charAt(0);

        if(ch=='i'){
            skipi(processed,unprocessed.substring(1));
        }
        else{
            skipi(processed+ch,unprocessed.substring(1));
        }
    }
}
