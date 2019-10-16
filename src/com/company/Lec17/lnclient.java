package com.company.Lec17;



public class lnclient {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        LinkedList list1= new LinkedList();
        LinkedList list2= new LinkedList();
//        list2.insertlast("3");
//        list2.insertlast("4");
//        list2.insertlast("9");
//        list1.insertlast("5");
//        list1.insertlast("6");
//        list1.insertlast("7");

//        list.insertbetween(2,"1");
//         list.deletelast();
//        list.deletefirst();
//        System.out.println(list.find("4"));
//        System.out.println(list.find("5"));

//        list.delete(1);
//
//        list.reverse();
//        list.duplicates();
//        LinkedList l3 =list.merge(list1,list2);
//        System.out.println(list.mid());

//        l3.display();

        for (int i = 0; i < 9; i++) {
            list.insertlast(i+1 + "");
        }
        list.kRev(3);
        list.display();
    }
}
