package com.company.Lec26;

public class LCS {


    public static void main(String[] args) {

        System.out.println(LCS("abcdef", "abdc"));


        System.out.println(LcsItrDp("abcdef","abdc"));

    }

    public static int LCS(String s1, String s2) {
        if (s1.length() == 0 || s2.length() == 0) {
            return 0;
        }


        if (s1.charAt(0) == s2.charAt(0)) {

            return 1 + LCS(s1.substring(1), s2.substring(1));
        } else {

            return Math.max(LCS(s1.substring(1), s2), LCS(s1, s2.substring(1)));
        }
    }

    public static int LCSDP(String s1, String s2, Integer[][] mem) {
        if (s1.length() == 0 || s2.length() == 0) {
            return 0;
        }

        int ans = 0;

        if (mem[s1.length()][s2.length()] != null) {

            return mem[s1.length()][s2.length()];
        }

        if (s1.charAt(0) == s2.charAt(0)) {

            ans = 1 + LCS(s1.substring(1), s2.substring(1));
        } else {

            ans = Math.max(LCS(s1.substring(1), s2), LCS(s1, s2.substring(1)));
        }

        mem[s1.length()][s2.length()] = ans;

        return mem[s1.length()][s2.length()];
    }


    public static int LcsItrDp(String s1,String s2){
        Integer mem[][] = new Integer[s1.length() + 1][s2.length() + 1];

        for (int i = 0; i <=s1.length() ; i++) {

            for (int j = 0; j <=s2.length() ; j++) {

                if(i==0 || j==0){
                    mem[i][j]=0;
                }

                else{

                    if(s1.charAt(i-1)==s2.charAt(j-1)){
                        mem[i][j]= 1+mem[i-1][j-1];
                    }

                    else{
                        mem[i][j]=Math.max(mem[i-1][j],mem[i][j-1]);
                    }
                }
            }
        }
        return mem[s1.length()][s2.length()];
    }




}
