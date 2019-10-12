package com.company.Lec15;

public class JavaTeacher implements Teacher {

    @Override
    public void study() {
        System.out.println(" Studies Java");
    }

    @Override
    public void bunk() {

    }

    @Override
    public void teach() {
        System.out.println("Teach Java");
    }

    public void dance(){
        System.out.println("I dance in Java");
    }
}
