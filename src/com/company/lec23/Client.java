package com.company.lec23;

public class Client {

    public static void main(String[] args) {

        MapUsingAL map= new MapUsingAL();
        map.put("apple","mast");
        map.put("orange","bekarr");
        map.put("banana","cool h");


        System.out.println(map.get("orange"));

//        map.remove("apple");
        System.out.println(map.get("apple"));
        System.out.println(map.get("banana"));

       }
}
