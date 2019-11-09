package com.company.Lec21;

import java.util.Arrays;

public class HumanClient {

    public static void main(String[] args) {

        Human zaid=new Human(21,"Zaid");
        Human shivam=new Human(19,"shivam");
        Human yukti=new Human(16,"yukti");
        Human sonali=new Human(21,"sonali");
        Human ishika=new Human(9,"ishika");


        Human ar[] ={zaid,yukti,shivam,sonali,ishika};
        System.out.println(Arrays.toString(ar));
        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));
    }
}
