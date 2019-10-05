package com.company.Lec13;

public class CircularQueue {

    private int data[];

    public int DEFAULT_SIZE=10;
    private int front=0;
    private int size=0;

    public int end=0;

    public CircularQueue(){

        this.data =new int[DEFAULT_SIZE];
    }

    public boolean isFull(){

        return size==data.length;
    }

    public boolean enqueue(int element){

        if(isFull()){
            return false;
        }

        data[end++]=element;
        end=end%data.length;
        size++;
        return true;
    }

    public boolean isEmpty() {
        return size==0;
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
        front=front%data.length;
        size--;

        return temp;
    }

    public int front()
    {
        return data[front];

    }

    public void display(){

        for (int i = 0; i <size ; i++) {
            System.out.print((front+i)%data.length+ " ");
        }

        System.out.println();
    }
}
