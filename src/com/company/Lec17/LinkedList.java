package com.company.Lec17;

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

    public void duplicates(){

        if(size<=1){
            return;
        }

        Node node= head;

        while(node.next!=null){

            if(node.name.equals(node.next.name)){
                node.next=node.next.next;
                size--;
            }
            else{
                node=node.next;
            }
        }
        tail=node;
        tail.next=null;
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

    public void reverse(){
        reverse(head);
    }
    public void reverse(Node node){

        if(node==tail){
            head=tail;
            return;
        }

        reverse(node.next);

        tail.next=node;
        tail=node;
        tail.next=null;

    }

    public String kthfromlast(int k){

        Node slow= head;
        Node fast=head;

        for (int i = 0; i <k ; i++) {
            fast=fast.next;
        }

        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }

      return slow.name;
    }

    public String mid(){

        Node slow= head;
        Node fast =head;

        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

//        while(fast.next!=null&&fast.next.next!=null){
//            slow=slow.next;
//            fast=fast.next.next;
//        }
        // array ={1,2,3,4,5,6}
        // when mid needs to be 3

        return slow.name;
    }

    public LinkedList merge(LinkedList first, LinkedList second){

        Node f= first.head;
        Node s= second.head;

        LinkedList res =new LinkedList();
        while(f!=null &&s!=null){

            if(f.name.compareTo(s.name)>0){
                res.insertlast(s.name);
                s=s.next;
            }
            else{
                res.insertlast(f.name);
                f=f.next;
            }
        }

        while(f!=null){
            res.insertlast(f.name);
            f=f.next;
        }

        while(s!=null){
            res.insertlast(s.name);
            s=s.next;
        }

        return res;
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

    public void kRev(int k) {
        head = kRev(head, k);
    }
    private Node kRev(Node node, int k){
        Node current = node;
        Node prev = null;
        Node next = null;

        int count = 0;
        while(count < k && current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }
        if(next != null) {
            node.next = kRev(next, k);
        }
        return prev;
    }
}
