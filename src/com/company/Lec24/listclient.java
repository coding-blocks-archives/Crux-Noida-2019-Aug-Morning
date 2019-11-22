package com.company.Lec24;

public class listclient {

    public static void main(String[] args) {

        AdjacencyListGraph<String> graph =new AdjacencyListGraph<>();

        graph.insertVertex("A");
        graph.insertVertex("C");
        graph.insertVertex("B");
        graph.insertVertex("D");



        graph.insertEdge("A","B");
        graph.insertEdge("A","C");
        graph.insertEdge("C","D");

//        graph.Dft();
//        System.out.println(graph.Dfs("A"));
        graph.shortdistance();

//        graph.display();
//        graph.Bft();
//        System.out.println(graph.connectedcomponents());
//        System.out.println(graph.isconnected());

    }
}