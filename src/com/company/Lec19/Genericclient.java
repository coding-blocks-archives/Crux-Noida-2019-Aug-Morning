package com.company.Lec19;

public class Genericclient {
    public static void main(String[] args) {

        GenericBst<Integer> tree = new GenericBst();
        tree.insert(10);
        tree.insert(13);
        tree.insert(2);

        tree.display();

    }
    }
