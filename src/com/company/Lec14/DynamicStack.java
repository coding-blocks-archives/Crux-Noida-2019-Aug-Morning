package com.company.Lec14;

public class DynamicStack extends Stack {

    @Override
    public boolean push(int element) {

        if(this.isFull()){


            int temp[] =new int[2*ar.length];

            System.out.println("me badal gya");

            for (int i = 0; i <ar.length ; i++) {

                temp[i]=ar[i];
            }

            ar=temp;
        }

        return super.push(element);
    }
}
