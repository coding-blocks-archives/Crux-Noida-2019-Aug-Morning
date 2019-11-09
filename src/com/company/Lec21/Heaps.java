package com.company.Lec21;

import java.util.ArrayList;

public class Heaps<T extends Comparable<T>> {

    private ArrayList<T> list =  new ArrayList<T>();


    public void insert(T value){

        list.add(value);
        upheap(list.size()-1);
    }

    public T remove() throws Exception{

        if(list.isEmpty()){
            throw new Exception("Khaaali he be");
        }

        T temp=list.get(0);
        T last =list.remove(list.size()-1);

        if(!list.isEmpty()){
            list.set(0,last);
            downheap(0);
        }
          return temp;
    }

    private void downheap(int index) {

        int min= index;

        int left=leftchild(index);

        int right=rightchild(index);

        if(left<list.size() && list.get(min).compareTo(list.get(left))>0){
            min=left;
        }

        if(right<list.size() && list.get(min).compareTo(list.get(right))>0){
            min=right;
        }

        if(min!=index){
            swap(index,min);
            downheap(min);
        }
    }

    private void upheap(int index) {

        if(index==0){
            return;
        }

        int p=parent(index);

        if(list.get(p).compareTo(list.get(index))>0){

            swap(p,index);
            upheap(p);
        }
    }

    public void swap(int first, int second){

        T temp= list.get(first);
        list.set(first,list.get(second));
        list.set(second,temp);
    }

    public int parent(int index){
        return (index-1)/2;
    }

    public int leftchild(int index){
        return (2*index)+1;
    }


    public int rightchild(int index){
        return (2*index)+2;
    }

    public void display(){
        System.out.println(list.toString());
    }
}
