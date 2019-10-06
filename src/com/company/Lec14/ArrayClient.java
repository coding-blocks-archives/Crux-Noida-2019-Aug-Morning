package com.company.Lec14;

public class ArrayClient {

    public static void main(String[] args) {

        Arraylist list = new Arraylist();
        for (int i = 0; i <100 ; i++) {
            list.add(i);
        }

        for (int i = 0; i <50 ; i++) {
            System.out.println(list.remove());
        }
    }
}
