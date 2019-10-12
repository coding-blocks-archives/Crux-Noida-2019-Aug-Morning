package com.company.Lec15;

public class Main {

    public static void main(String[] args) {

     Teacher teacher = new JavaTeacher();
     teacher.study();
     ((JavaTeacher) teacher).dance();

    }
}
