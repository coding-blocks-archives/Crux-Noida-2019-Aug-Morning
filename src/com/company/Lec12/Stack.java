package com.company.Lec12;

public class Stack {

    private int[] ar;

    private int DEFAULT_SIZE=10;

    private int top;

    public Stack(){
        this.ar= new int[DEFAULT_SIZE];
        top=-1;
    }

    public boolean isFull(){

        return top==ar.length-1;
    }


    public boolean push(int element){

        if(isFull()){
            return false;
        }

        ar[++top]=element;
        return true;
    }

    public boolean isEmpty(){
        return top==-1;
    }

    public int pop() throws Exception{

        if(isEmpty()){
           throw new Exception("Khaali he be");
        }

        return ar[top--];
    }

    public int peek(){
        return ar[top];
    }
}
