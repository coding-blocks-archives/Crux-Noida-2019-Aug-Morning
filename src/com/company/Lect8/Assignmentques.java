package com.company.Lect8;

public class Assignmentques {

    public static void main(String[] args) {
        System.out.println(asciidiff("afc"));
    }

    public static StringBuilder asciidiff(String s){

        StringBuilder builder =new StringBuilder();

        builder.append(s.charAt(0));

        for (int i = 1; i <s.length() ; i++) {

            char ch = s.charAt(i);
            char ch1 = s.charAt(i-1);
            int diff =Math.abs(ch-ch1);

            builder.append(diff);
            builder.append(ch);
        }
        return builder;
    }
}
