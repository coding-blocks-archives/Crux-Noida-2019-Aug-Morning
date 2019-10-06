package com.company.Lec13;

public class QueueClient {

    public static void main(String[] args) {

       CircularQueue queue = new CircularQueue();

        for (int i = 1; i <10 ; i++) {
            queue.display();
            queue.enqueue(i);
        }

        for (int i = 0; i <8 ; i++) {
            queue.display();
            queue.deque();
        }
    }
}
