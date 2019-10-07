package com.company.Lec14;

import com.company.Lec12.Stack;

public class StackClient {

    public static void main(String[] args) throws Exception {


        Stack stack= new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        try {
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println("Will i be executed");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("Will i be executed");
    }
}
