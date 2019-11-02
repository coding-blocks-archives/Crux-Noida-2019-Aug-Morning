package com.company.Lec20;

import java.util.LinkedList;
import java.util.Queue;

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


    public T successor(T key){

        T next=null;

        Node current=root;

        while(current!=null){

            if(current.value.compareTo(key)>0){

                if(next==null || current.value.compareTo(next)<0){
                    next=current.value;
                }
                current= current.left;
            }
            else{
                current=current.right;
            }
        }
        return next;
    }

    public void inrange(T k1, T k2){

        inrange(k1,k2,root);
    }

    private void inrange(T k1, T k2, Node node) {

      if(node==null){
          return;
      }

      if(node.value.compareTo(k1)>0 && node.value.compareTo(k2)<0 ){
          System.out.println(node.value);
      }

      if(node.value.compareTo(k1)>0){
          inrange(k1,k2,node.left);
      }

      if(node.value.compareTo(k2)<0){
          inrange(k1,k2,node.right);
      }

    }

    public LinkedList<T> sorted(){

        LinkedList<T> nodes= new LinkedList<>();

        sorted(nodes,root);

        return nodes;
    }

    public boolean checkbst(){

       return checkbst(root,null,null);

    }

    private boolean checkbst(Node node, T min, T max) {

        if(node==null){
            return true;
        }

        if(min!=null &&node.value.compareTo(min)<0){
            return false;
        }

        if(max!=null && node.value.compareTo(max)>0){
            return false;
        }

        return checkbst(node.left,min,node.value) && checkbst(node.right,node.value,max);
    }

    private void sorted(LinkedList<T> nodes, Node node) {

    if(node == null){
        return;
    }

    sorted(nodes,node.left);
    nodes.addLast(node.value);
    sorted(nodes,node.right);
    }


    public void levelordertraversal(){

        levelordertraversal(root);
    }

    private void levelordertraversal(Node node) {

        Queue<Node> queue =new LinkedList();

        queue.add(node);

        while(!queue.isEmpty()){

            Node temp= queue.remove();

            System.out.println(temp.value);

            if(temp.left!=null){
            queue.add(node.left);
            }

            if(temp.right!=null){
                queue.add(node.right);
            }

        }
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
