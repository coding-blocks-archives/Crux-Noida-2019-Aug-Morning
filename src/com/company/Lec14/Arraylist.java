package com.company.Lec14;

import java.util.ArrayList;

public class Arraylist {

    private int data[];
    private int DEFAULT_SIZE=10;
    private int size=0;

    public Arraylist(){

        data=new int[DEFAULT_SIZE];

    }

    public boolean isFull(){
        return size==data.length;
    }

    public void  add(int element){

        if(isFull()){
            resize();
        }

        System.out.println("Inserting element" + element);

        data[size++]=element;
    }

    private void resize() {

        int temp[] =new int[2*data.length];

        System.out.println("me badal gya");

        for (int i = 0; i <data.length ; i++) {

            temp[i]=data[i];
        }

        data=temp;
    }

    public int remove(){

        return data[--size];
    }

    public void set(int index, int element){

        data[index]=element;
    }

    public int get(int index){

        return data[index];
    }

    public int size(){

        return size;
    }
}
