package com.company.Lec25;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Main<T> {
    private LinkedList<Vertex> vertices =new LinkedList<>();

    public boolean bipartitite(){

        Queue<Vertex> queue= new LinkedList<>();
        Set<Vertex> visited = new HashSet<>();
        Vertex first = vertices.get(0);
        Set<Vertex> red= new HashSet<>();
        Set<Vertex> green= new HashSet<>();

        queue.add(first);
        visited.add(first);
        red.add(first);

        while(!queue.isEmpty()){

            Vertex temp= queue.remove();

            if(red.contains(temp)){

                for (Vertex vertex : temp.link) {
                    if(!visited.contains(vertex)){
                        queue.add(vertex);
                        visited.add(vertex);
                        green.add(vertex);
                    }
                    else if(red.contains(vertex)){
                        return false;
                    }
                }
            }
            if(green.contains(temp)){

                for (Vertex vertex : temp.link) {
                    if(!visited.contains(vertex)){
                        queue.add(vertex);
                        visited.add(vertex);
                        red.add(vertex);
                    }
                    else if(green.contains(vertex)){
                        return false;
                    }
                }
            }
            }
            return true;
    }


    class Vertex{

        T value;

        LinkedList<Vertex> link = new LinkedList<>();

        public Vertex(T value){
            this.value=value;
        }
    }

}

