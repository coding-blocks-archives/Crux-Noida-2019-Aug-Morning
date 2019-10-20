package com.company.Lec19;

import java.util.Scanner;

public class BInaryTree {

    private Node root;

    public void insert(Scanner s){
        this.root=insert(root,s);
    }

    private Node insert(Node node, Scanner s) {
        if(node==null){
            System.out.println("Enter the value of node");
            int value = Integer.parseInt(s.nextLine());
            return new Node(value);
        }

        System.out.println("Enter the direction");
        String dir =s.nextLine();

        if(dir.equals("left")){
            node.left=insert(node.left,s);
        }
        else{
            node.right=insert(node.right,s);
        }
        return node;
    }

    public void display(){
        display(root,"");
    }

    public int height(){
       return height(root);
    }

    private int height(Node node) {

        if(node==null){
            return 0;
        }

        return 1+ Math.max(height(node.left),height(node.right));
    }

    public boolean find(int target){
       return find(root,target);
    }

    private boolean find(Node node,int target) {

        if(node==null){
            return false;
        }

        if(node.value==target){
            return true;
        }

        return find(node.left,target)||find(node.right,target);
    }

    public int diameter(){
       return diameter(root);
    }

    private int diameter(Node node) {

        if(node==null){
            return 0;
        }

        int currentmax= 1+height(node.left)+height(node.right);

        int max=Math.max(diameter(node.left),diameter(node.right));

        return Math.max(currentmax,max);

    }

    public void mirror(){
        mirror(root);
    }

    private void mirror(Node node) {
        if(node==null){
            return;
        }

        Node temp= node.left;
        node.left=node.right;
        node.right=temp;

        mirror(node.left);
        mirror(node.right);
    }

    private void display(Node node, String indent) {
      // Preorder by default
        if(node==null){
            return;
        }

        System.out.println(indent+node.value);
        display(node.left,indent+"\t");
        display(node.right,indent+"\t");
    }




    public class Node{

        private int value;
        private Node left;
        private Node right;

        public Node(int value){
            this.value=value;
        }
    }
}
