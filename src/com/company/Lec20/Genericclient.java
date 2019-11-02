package com.company.Lec20;

import java.util.LinkedList;

public class Genericclient {
    public static void main(String[] args) {

        GenericBst<Integer> tree = new GenericBst();
        tree.insert(5);
        tree.insert(1);
        tree.insert(6);
        tree.levelordertraversal();
        tree.inrange(3,8);
        LinkedList<Integer> list= tree.sorted();
       for (Integer item: list) {
            System.out.println(item);
        }

        tree.display();

    }
    }
