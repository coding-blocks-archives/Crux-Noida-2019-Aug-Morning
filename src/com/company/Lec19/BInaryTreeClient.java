package com.company.Lec19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BInaryTreeClient {

    public static void main(String[] args) throws FileNotFoundException {

        BInaryTree tree = new BInaryTree();
        File file =new File("input.txt");
        Scanner s = new Scanner(file);
        tree.insert(s);
        tree.insert(s);
        tree.insert(s);
        tree.mirror();
        System.out.println(tree.diameter());
        System.out.println(tree.find(190));
        tree.display();
    }
}
