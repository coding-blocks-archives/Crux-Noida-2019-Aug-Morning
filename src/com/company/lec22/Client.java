package com.company.lec22;

public class Client {

    public static void main(String[] args) {

        MapusingArray map= new MapusingArray();
        map.put("apple","mast");
        map.put("orange","bekarr");
        map.put("banana","cool h");


        System.out.println(map.get("orange"));

        map.remove("apple");
        System.out.println(map.get("apple"));

       }
}
