package com.company.Lec24;

import java.util.*;

public class AdjacencyListGraph<T> {

    private LinkedList<Vertex> vertices;

    public AdjacencyListGraph() {
            this.vertices = new LinkedList<>();
        }

        public void insertVertex (T value){

            vertices.add(new Vertex(value));
        }

        public void insertEdge (T first, T second){

            Vertex f = get(first);
            Vertex s = get(second);

            if (f != null && s != null) {

                f.neighbours.add(s);
                s.neighbours.add(f);
            }
        }

        public LinkedList<LinkedList<Vertex>> connectedcomponents(){

            Queue<Vertex> queue = new LinkedList<>();
            Set<Vertex> visited = new HashSet<>();

            LinkedList<LinkedList<Vertex>> list= new LinkedList<>();

            for (Vertex vertex: vertices) {

                if(visited.contains(vertex)){
                    continue;
                }

                LinkedList<Vertex> link= new LinkedList<>();
                queue.add(vertex);
                visited.add(vertex);



                while (!queue.isEmpty()) {

                    Vertex temp = queue.remove();
                    link.add(temp);

                    for (Vertex padosi : temp.neighbours) {
                        if (!visited.contains(padosi)) {
                            queue.add(padosi);
                            visited.add(padosi);
                            link.add(padosi);
                        }
                    }
                }
                list.add(link);
            }
            return list;
        }


        public boolean isconnected(){

             LinkedList<LinkedList<Vertex>> list =connectedcomponents();
              return list.size()<2;
        }

        public void shortdistance(){
            Vertex first= vertices.get(0);
            int distance=0;
            Queue<Vertex> queue = new LinkedList<>();
            Set<Vertex> visited= new HashSet<>();

            queue.add(first);
            visited.add(first);
            queue.add(null);

            while(queue.size()>1){

                Vertex temp= queue.remove();

                if(temp==null){
                    distance++;
                    queue.add(null);
                }
                else {
                    System.out.println(temp.value + " " + distance);

                    for (Vertex vertex : temp.neighbours) {
                        if (!visited.contains(vertex)) {
                            queue.add(vertex);
                            visited.add(vertex);
                        }
                    }
                }
            }
        }

        public void Bft(){

            Vertex first= vertices.get(0);

            Queue<Vertex> queue = new LinkedList<>();
            Set<Vertex> visited= new HashSet<>();

            queue.add(first);
            visited.add(first);

            while(!queue.isEmpty()){

                Vertex temp= queue.remove();
                System.out.println(temp.value);

                for (Vertex vertex:temp.neighbours){
                    if(!visited.contains(vertex)){
                        queue.add(vertex);
                        visited.add(vertex);
                    }
                }
            }
       }


    public boolean Dfs(T value){

        if(vertices.isEmpty()){
            return false;
        }

        Vertex first= vertices.get(0);

        Stack<Vertex> stack = new Stack<>();
        Set<Vertex> visited= new HashSet<>();

        stack.push(first);
        visited.add(first);

        while(!stack.isEmpty()){

            Vertex temp= stack.pop();

            if(temp.value.equals(value)){
                return true;
            }

            for (Vertex vertex:temp.neighbours){
                if(!visited.contains(vertex)){
                    stack.push(vertex);
                    visited.add(vertex);
                }
            }
        }
        return false;
    }

    public void Dft(){

        Vertex first= vertices.get(0);

        Stack<Vertex> stack = new Stack<>();
        Set<Vertex> visited= new HashSet<>();

        stack.push(first);
        visited.add(first);

        while(!stack.isEmpty()){

            Vertex temp= stack.pop();
            System.out.println(temp.value);

            for (Vertex vertex:temp.neighbours){
                if(!visited.contains(vertex)){
                    stack.push(vertex);
                    visited.add(vertex);
                }
            }
        }
    }

        public void display () {

            for (Vertex vertex : vertices) {

                System.out.print(vertex.value + " => ");

                for (Vertex padosi : vertex.neighbours) {

                    System.out.print(padosi.value);
                }
                System.out.println();
            }

        }

        public Vertex get (T value){

            for (Vertex vertex : vertices) {

                if (vertex.value.equals(value)) {
                    return vertex;
                }
            }
            return null;
        }


        public class Vertex {

            T value;
            LinkedList<Vertex> neighbours;

            public Vertex(T value) {
                this.value = value;
                this.neighbours = new LinkedList<>();
            }
        }

    }

