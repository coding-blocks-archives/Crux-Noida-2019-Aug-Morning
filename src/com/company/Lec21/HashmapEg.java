package com.company.Lec21;

import java.util.HashMap;
import java.util.Map;

public class HashmapEg {

    public static void main(String[] args) {

        Map<String,String> map= new HashMap<>();

        map.put("Shubham","Smart");
        map.put("Kunal","handsome");
        map.put("lala","pagal");
        map.put("Vishesh","Clever");

        map.remove("lala");
        System.out.println(map.get("lala"));
        System.out.println(map.toString());
        for (String key: map.keySet()) {
            System.out.println(key);
        }

        for (String item: map.values()) {
            System.out.println(item);
        }
    }

    public HashMap<Character,Integer> freq(String line){

        HashMap<Character,Integer> map = new HashMap<>();

        for (int i = 0; i <line.length() ; i++) {
            char ch=line.charAt(i);

            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }

        }
        return map;
    }
}
