package com.company.Lec18;

import java.util.Scanner;

public class GenericTreeClient {

    public static void main(String[] args) {

        GenericTrees tree =new GenericTrees();

        Scanner s= new Scanner(System.in);

        tree.insert(s);
        tree.postorder();
//        tree.display();
//        System.out.println(tree.count());
//        System.out.println(tree.height());
        System.out.println();
        System.out.println();
        tree.depth(2);
    }
}
