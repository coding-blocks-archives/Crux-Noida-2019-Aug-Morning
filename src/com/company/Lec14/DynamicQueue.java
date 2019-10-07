package com.company.Lec14;

public class DynamicQueue extends CircularQueue {

    @Override
    public boolean enqueue(int element) {

        if(this.isFull()){


            int temp[] =new int[2*data.length];

            System.out.println("me badal gya");

            for (int i = 0; i <data.length ; i++) {

                temp[i]=data[(front+i)%data.length];
            }

            data=temp;
            front=0;
            end= size;

        }
        return super.enqueue(element);
    }
}
