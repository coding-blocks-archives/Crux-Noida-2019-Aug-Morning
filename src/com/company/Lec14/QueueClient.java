package com.company.Lec14;

import com.company.Lec13.CircularQueue;

public class QueueClient {

    public static void main(String[] args) {

       DynamicQueue queue = new DynamicQueue();

        for (int i = 1; i <100 ; i++) {
            queue.display();
            queue.enqueue(i);
        }

        for (int i = 0; i <98 ; i++) {
            queue.display();
            queue.deque();
        }
    }
}
