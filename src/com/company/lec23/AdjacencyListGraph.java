package com.company.lec23;

import java.util.LinkedList;

public class AdjacencyListGraph<T> {

    private LinkedList<Vertex> vertices;

    public AdjacencyListGraph() {
        this.vertices = new LinkedList<>();
    }

    public void insertVertex(T value){

        vertices.add(new Vertex(value));
    }

    public void insertEdge(T first, T second){

        Vertex f= get(first);
        Vertex s=get(second);

        if(f!=null && s!=null){

            f.neighbours.add(s);
            s.neighbours.add(f);
        }
    }

    public void display(){

        for (Vertex vertex:vertices) {

            System.out.print(vertex.value+ " => ");

            for (Vertex padosi:vertex.neighbours) {

                System.out.print(padosi.value);
            }
            System.out.println();
        }

    }

    public Vertex get(T value){

        for (Vertex vertex:vertices) {

            if(vertex.value.equals(value)){
                return vertex;
            }
        }
        return null;
    }




    public class Vertex{

        T value;
        LinkedList<Vertex> neighbours;

        public Vertex(T value) {
            this.value = value;
            this.neighbours=new LinkedList<>();
        }
    }
}
