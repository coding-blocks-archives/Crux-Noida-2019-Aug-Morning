package com.company.Lec18;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GenericTrees {

    private Node root;

    public void insert(Scanner s){
        System.out.println("Enter the value root node");
        int value =s.nextInt();
        this.root= new Node(value);
        insert(s,root);
    }

    private void insert(Scanner s, Node node) {

        while(true){

            System.out.println("do you want to add child of node "+ node.value );
            boolean yes= s.nextBoolean();

            if(yes){
                System.out.println("Enter the value");
                int value= s.nextInt();
                Node child = new Node(value);
                node.children.add(child);
                insert(s,child);
            }
            else{
                break;
            }
        }
    }

    public void display(){
        display(root,"");
    }

    private void display(Node node, String indent) {

        System.out.println(indent+node.value);

        for (int i = 0; i <node.children.size() ; i++) {

            display(node.children.get(i),indent+"\t");
        }

    }

    public void postorder(){
        postorder(root);
    }

    private void postorder(Node node) {



        for (int i = 0; i <node.children.size() ; i++) {

            postorder(node.children.get(i));
        }
        System.out.print(node.value+" ");
    }

    public void depth(int k){
        depth(root,k);
    }

    private void depth(Node node,int k) {

        if (node == null) {
         return;
        }

        if(k==0){
            System.out.println(node.value);
            return;
        }

        for (int i = 0; i <node.children.size(); i++) {
            depth(node.children.get(i),k-1);
        }
    }

    public int height(){
       return height(root);
    }

    private int height(Node node) {

        int maxheight=0;

        for (int i = 0; i <node.children.size() ; i++) {

            int height=height(node.children.get(i));
            maxheight=Math.max(maxheight,height);
        }

        return 1+maxheight;
    }

    public void levelorder(){

        levelorder(root);
    }

    private void levelorder(Node node) {

     Queue<Node> queue =new LinkedList<>();
     queue.add(node);

     while(!queue.isEmpty()){
         Node temp= queue.remove();
         System.out.println(temp.value);
         for (int i = 0; i <temp.children.size() ; i++) {
             Node child =temp.children.get(i);
             queue.add(child);
         }
     }

    }

    public void maxvalue(){
        int max=root.value;
        maxvalue(max,root);
    }

    private int maxvalue(int max, Node node) {

        if(max<node.value){
            max=node.value;
        }

        for (int i = 0; i <node.children.size(); i++) {

           max = maxvalue(max,node.children.get(i));
        }

       return max;
    }


    public int count(){

        return count(root);
    }

    private int count(Node node) {

        int cnt=1;

        for (int i = 0; i <node.children.size() ; i++) {
            cnt+= count(node.children.get(i));
        }
        return cnt;
    }

    public class Node{

        private int value;
        private ArrayList<Node> children;

        public Node(int value){
            this.value=value;
            this.children=new ArrayList<>();
        }

    }
}
