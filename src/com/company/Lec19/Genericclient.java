package com.company.Lec19;

public class Genericclient {
    public static void main(String[] args) {

        GenericBst<String> tree = new GenericBst();
        tree.insert("ac");
        tree.insert("aa");
        tree.insert("ad");

        tree.display();

    }
    }
