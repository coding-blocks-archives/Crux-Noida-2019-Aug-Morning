package com.company.Lect6;

import java.util.ArrayList;

public class ArrayListeg {

    public static void main(String[] args) {

        ArrayList<Integer> ar =new ArrayList();

        ar.add(1);
        ar.add(2);
        ar.add(3);
        ar.set(0,5);
        System.out.println(ar.indexOf(2));

    }
}
