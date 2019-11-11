package com.company.lec23;

import com.company.lec22.MapusingLink;

import java.util.ArrayList;
import java.util.LinkedList;

public class MapUsingAL<K,V> {


    private ArrayList<LinkedList<Entity>> entities;
    private int size=0;

    public float lf=0.5f;


    public MapUsingAL() {
        this.entities=new ArrayList<LinkedList<Entity>>();


        for (int i = 0; i <100 ; i++) {

            entities.add(new LinkedList<>());
        }
    }


    public void put(K key, V value){

        int hashcode = Math.abs(key.hashCode() % entities.size());
        LinkedList<Entity> list = entities.get(hashcode);

        for (Entity entity: list) {

            if(entity.key.equals(key)){
                entity.value=value;
                return;
            }
        }


        if(((float)(size))/entities.size()>lf){
            rehash();
        }

        list.add(new Entity(key,value));
        size++;

    }

    private void rehash() {

        ArrayList<LinkedList<Entity>> old =entities;
        entities=new ArrayList<>();
        for (int i = 0; i <old.size()*2 ; i++) {
            entities.add(new LinkedList<>());
        }
        size=0;    //making size 0 again is also a step which we can consider.
        for (LinkedList<Entity> list: old) {

            for (Entity entity: list) {

                put(entity.key,entity.value);
            }
        }
    }

    public V get(K key){

        int hashcode = Math.abs(key.hashCode() % entities.size());

        LinkedList<Entity> list = entities.get(hashcode);

        for (Entity entity: list) {

            if(entity.key.equals(key)){
                return entity.value;
            }
        }
        return null;
    }

    public void delete(K key){

        int hashcode = Math.abs(key.hashCode() % entities.size());

        LinkedList<Entity> list = entities.get(hashcode);

        Entity target= null;

        for (Entity entity:list) {
            if(entity.key.equals(key)){
                target=entity;
                break;
            }
        }
        list.remove(target);
        size--;
    }


    public class Entity{

        K key;
        V value;

        public Entity(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

}
