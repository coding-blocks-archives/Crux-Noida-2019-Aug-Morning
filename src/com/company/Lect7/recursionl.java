package com.company.Lect7;

public class recursionl {


    public static void main(String[] args) {
        p4();
    }

    public static void p4(){

        p3();
        System.out.println("4");
    }

    public static void p3(){


        p2();
        System.out.println("3");
    }

    public static void p2(){


        p1();
        System.out.println("2");
    }

    public static void p1(){


        p0();
        System.out.println("1");

    }

    private static void p0() {
              return;
    }


}
