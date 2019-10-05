package com.company.Lec13;

public class OptimizedQueue {

    private int data[];

    public int DEFAULT_SIZE=10;
    private int front=0;

    public int end=0;

    public OptimizedQueue(){

        this.data =new int[DEFAULT_SIZE];
    }

    public boolean isFull(){

        return end==data.length;
    }

    public boolean enqueue(int element){

        if(isFull()){
            return false;
        }

        data[end++]=element;
        return true;
    }

    public boolean isEmpty(){
        return end==front;
    }

    public int deque(){

        if(isEmpty()){
            System.out.println("Empty");
            return 0;
        }

        int temp = data[front++];

//        for (int i = 1; i <end ; i++) {
//            data[i-1]=data[i];
//        }

        return temp;
    }

    public int front(){
        return data[front];
    }

    public void display(){

        for (int i = front; i <end ; i++) {
            System.out.print(data[i]+ " ");
        }

        System.out.println();
    }
}
