package com.company.Lec16;

public class LinkedList {

    private Node head;

    private Node tail;

    private int size;

    public LinkedList() {
        this.size = 0;
    }

    public void insertfirst(String value){

        Node node= new Node(value);
        node.next=head;
        head=node;

        size++;

        if(tail==null){
            tail=head;
        }

    }

    public void insertlast(String value){

        if(size==0){
            insertfirst(value);
            return;
        }

        Node node =new Node(value);
        tail.next=node;
        tail=node;

        size++;
    }

    public void insertbetween(int index,String value){

        if(index==0){
            insertfirst(value);
            return;
        }

        if(index==size){
            insertlast(value);
            return;
        }

        Node prev= get(index-1);
        Node node = new Node(value);
        node.next=prev.next;
        prev.next=node;

        size++;
    }

    public Node find(String name){

        Node temp=head;

        while(temp!=null){

            if(temp.name.equals(name)){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }

    public void display(){

        Node temp= head;

        while(temp!=null){
            System.out.print(temp.name+"->");
            temp=temp.next;
        }
        System.out.print("end");
    }

    public String deletefirst(){

        if(size==0){
            System.out.println("list is empty");
            return null;
        }

        String temp= head.name;

        head=head.next;
        size--;

        return temp;
    }

    public String deletelast(){

        if(size<2){
           return deletefirst();

        }

//        Node temp =head;

//        while(temp.next!=tail){
//
//            temp=temp.next;
//        }
        Node temp=get(size-2);
        String del=temp.next.name;
        tail=temp;
        tail.next=null;

        size--;
        return del;

    }
    public String delete(int index){

        if(index==0){
           return deletefirst();
        }

        if(index==size-1){
            return deletelast();
        }

        Node prev= get(index-1);
        String temp=prev.next.name;
        prev.next=prev.next.next;

        size--;
        return temp;
    }

    public Node get(int index){

        Node temp=head;
        for (int i = 0; i <index ; i++) {
            temp=temp.next;
        }

        return temp;
    }

    public class Node{

        private String name;
        private Node next;

        public Node(String name) {
            this.name = name;
        }
    }
}
