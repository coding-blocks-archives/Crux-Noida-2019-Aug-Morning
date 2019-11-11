package com.company.lec23;

public class Listgraphclient {

    public static void main(String[] args) {

        AdjacencyListGraph<String> graph =new AdjacencyListGraph<>();
        graph.insertVertex("A");
        graph.insertVertex("B");
        graph.insertVertex("C");
        graph.insertVertex("D");

        graph.insertEdge("A","B");
        graph.insertEdge("C","A");
        graph.insertEdge("A","D");
        graph.insertEdge("B","D");

        graph.display();
    }
}
