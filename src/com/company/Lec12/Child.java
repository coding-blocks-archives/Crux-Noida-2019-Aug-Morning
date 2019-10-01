package com.company.Lec12;

public class Child {

    public static void main(String[] args) {

        Human shubham = new Human();

        shubham.fest();
        int ar[]=new int[9];
        shubham.name="Shubham";
        System.out.println(shubham.name);
        System.out.println(shubham.balance);
        shubham.balance();
        shubham.balance();
        shubham.balance();

        Human manish =new Human();
        manish.name="Manish";
        System.out.println(manish.balance);




    }
}
