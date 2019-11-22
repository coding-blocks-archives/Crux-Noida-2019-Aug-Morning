package com.company.Lec25;

import java.util.*;

public class AdjacencyMapgraph {

    private Map<Integer, Vertex>  vertexMap;
    Map<Vertex,Vertex> parent;

    public AdjacencyMapgraph(){
        this.vertexMap=new HashMap<>();
    }

    public void addVertex(int value){

        if(!vertexMap.containsKey(value)){

            vertexMap.put(value,new Vertex(value));
        }
    }

    public void addEdge(int first, int second){

        vertexMap.get(first).neighbours.put(vertexMap.get(second),1);
        vertexMap.get(second).neighbours.put(vertexMap.get(first),1);
        }

    public void addEdgeWeight(int first, int second, int weight){

        vertexMap.get(first).neighbours.put(vertexMap.get(second),weight);
        vertexMap.get(second).neighbours.put(vertexMap.get(first),weight);
    }

    public AdjacencyMapgraph kruskal(){

        parent();
        ArrayList<Edge> list = new ArrayList<>();
        AdjacencyMapgraph graph= new AdjacencyMapgraph();

        for (int value:vertexMap.keySet()) {

            graph.addVertex(value);
        }

        for (Vertex vertex:vertexMap.values()) {
            for (Vertex padosi: vertex.neighbours.keySet()) {

                list.add(new Edge(vertex,padosi,padosi.value));
                }
        }

        list.sort((o1, o2) -> o1.weight-o2.weight);


        for (Edge e: list) {

            if(union(e.first,e.second)){
                graph.addEdgeWeight(e.first.value,e.second.value,e.weight);
            }
        }
        return graph;
    }

    public void display(){
        for (Integer i:vertexMap.keySet()) {
            System.out.print(i+"-> ");
            for (Vertex padosi:vertexMap.get(i).neighbours.keySet()){
                System.out.print(padosi.value+" ");
            }
            System.out.println();
        }
    }


    public Map<Vertex,Vertex> parent(){

       this.parent = new HashMap<>();

        for (Vertex vertex: vertexMap.values()) {

            parent.put(vertex,null);
        }
        return parent;
    }

    public Vertex find(Vertex vertex){
        Vertex p=vertex;

        while(parent.get(p)!=null){
            p=parent.get(p);
        }

        return p;
    }



    public boolean union(Vertex first, Vertex second){

        Vertex f=find(first);
        Vertex s =find(second);

        if(f!=s){
            parent.put(f,s);
            return true;
        }

        return false;
    }

    class Vertex{
        int value;
        Map<Vertex,Integer> neighbours;

        public Vertex(int value) {
            this.value= value;
            this.neighbours= new HashMap<>();
        }
    }

    class Edge{

        Vertex first;
        Vertex second;
        int weight;

        public Edge(Vertex first, Vertex second, int weight) {
            this.first = first;
            this.second = second;
            this.weight = weight;
        }
    }
}
