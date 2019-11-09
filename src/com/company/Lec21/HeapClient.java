package com.company.Lec21;

public class HeapClient {

    public static void main(String[] args) {

        Heaps<Integer> heap= new Heaps<>();

        heap.insert(5);
        heap.insert(2);
        heap.insert(6);
        heap.insert(7);
        heap.insert(1);

        heap.display();
    }
}
