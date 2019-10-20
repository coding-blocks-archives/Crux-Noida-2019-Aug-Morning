package com.company.Lec19;

public class GenericBst<T extends Comparable<T>> {

    private Node root;

    public void insert(T value){
       this.root =insert(root,value);
    }

    private Node insert(Node node, T value){

        if(node==null){
            return new Node(value);
        }

        if(value.compareTo(node.value)<0){
            node.left=insert(node.left,value);
        }
        else{
            node.right=insert(node.right,value);
        }
        return node;
    }

    public void display(){
        display(root,"");
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

        private T value;
        private Node left;
        private Node right;

        public Node(T value){
            this.value=value;
        }
    }
}
