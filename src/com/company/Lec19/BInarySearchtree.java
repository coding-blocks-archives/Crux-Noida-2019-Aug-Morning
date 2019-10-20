package com.company.Lec19;

public class BInarySearchtree {

    private Node root;

    public void insert(int value){
       this.root =insert(root,value);
    }

    private Node insert(Node node, int value){

        if(node==null){
            return new Node(value);
        }

        if(node.value<value){
            node.left=insert(node.left,value);
        }
        else{
            node.right=insert(node.right,value);
        }
        return node;
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
