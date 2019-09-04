package com.company.Lect4;

import java.util.Scanner;

public class reverse {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int rev=0;
        while(n!=0){
            int rem=n%10;
            n=n/10;
//            rev=rev*10+rem;
            System.out.println(rem);
        }
        System.out.println(rev);
    }
}
