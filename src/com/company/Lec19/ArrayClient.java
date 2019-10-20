package com.company.Lec19;

import java.util.ArrayList;

public class ArrayClient {

    public static void main(String[] args) {

//        ArrayList
        Arraylist<Integer> list = new Arraylist();
        for (int i = 0; i <100 ; i++) {
            list.add(i);
        }

        for (int i = 0; i <50 ; i++) {
            System.out.println(list.remove());
        }
    }
}
