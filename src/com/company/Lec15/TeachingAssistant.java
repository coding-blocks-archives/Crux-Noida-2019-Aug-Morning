package com.company.Lec15;

public class TeachingAssistant implements Student, Teacher {
    @Override
    public void study() {
        System.out.println("I study more like student");
    }

    @Override
    public void teach() {
        System.out.println("I teach more like a teacher ");
    }

    @Override
    public void bunk() {
        System.out.println("bunk");
    }
}
