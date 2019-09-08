package com.company.Lect7;

public class buildereg {

    public static void main(String[] args) {


        String s="HellO";

        StringBuilder builder=new StringBuilder(s);

//        for (int i = 0; i <100000 ; i++) {
//
//          //  s=s+"a";
//            builder.append("a");
//        }

//        builder.setCharAt(0,'a');

//        System.out.println(s);
//        System.out.println(builder);

        toggle(s);
    }

    public static void toggle(String s){
         StringBuilder builder = new StringBuilder(s);

        for (int i = 0; i <builder.length() ; i++) {

            char ch= s.charAt(i);

            if(ch>='a'&&ch<='z'){

                ch= (char)('A'+(ch-'a'));
            }

            else{
                ch= (char)('a'+(ch-'A'));
            }
            builder.setCharAt(i,ch);
        }
        System.out.println(builder);
    }
}
