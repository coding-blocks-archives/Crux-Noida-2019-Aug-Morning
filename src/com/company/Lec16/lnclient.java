package com.company.Lec16;

public class lnclient {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.insertfirst("3");
        list.insertfirst("4");
        list.insertfirst("5");
        list.insertlast("7");

//        list.insertbetween(2,"1");
//         list.deletelast();
//        list.deletefirst();
//        System.out.println(list.find("4"));
//        System.out.println(list.find("5"));

        list.delete(1);
        list.display();


    }
}
