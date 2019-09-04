package com.company.Lect4;

public class converter {


    public static void main(String[] args) {
        int bin=1011;
//        System.out.println(bintodeci(bin));
        int deci =anytoany(bin,2,2);
        System.out.println(deci);
    }

    public static int bintodeci(int bin){
        int deci=0;

        int place=1;

        while(bin!=0){

            int rem=bin%10;
            bin=bin/10;
            deci=deci+rem*place;
            place=place*2;
        }
        return deci;
    }

    public static int anytodeci(int any,int base){
        int deci=0;

        int place=1;

        while(any!=0){

            int rem=any%10;
            any=any/10;
            deci=deci+rem*place;
            place=place*base;
        }
        return deci;
    }

    public static int decitobin(int deci){
        int bin=0;

        int place=1;

        while(deci!=0){

            int rem=deci%2;
            deci=deci/2;
            bin=bin+rem*place;
            place=place*10;
        }
        return bin;
    }

    public static int decitoany(int deci,int base){
        int any=0;

        int place=1;

        while(deci!=0){

            int rem=deci%base;
            deci=deci/base;
            any=any+rem*place;
            place=place*10;
        }
        return any;
    }

    public static int anytoany(int any,int sbase,int ebase){
       int deci= anytodeci(any,sbase);

       return decitoany(deci,ebase);
    }
}
