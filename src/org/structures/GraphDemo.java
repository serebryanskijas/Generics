package org.structures;


import java.util.ArrayList;

public class GraphDemo {
    public static void main(String[] args) {
        Graph<Integer> graph = new Graph<>();
        Graph.Node n1 = graph.new Node(1);
        Graph.Node n2 = graph.new Node(2);
        Graph.Node n3 = graph.new Node(3);
        Graph.Node n4 = graph.new Node(4);
        Graph.Node n5 = graph.new Node(5);

        graph.addNode(n1);
        graph.addNode(n2);
        graph.addNode(n3);
        graph.addNode(n4);
        graph.addNode(n5);

        graph.addEdges(n1,n2);
        graph.addEdges(n1,n3);
        graph.addEdges(n1,n4);
        graph.addEdges(n2,n4);
        graph.addEdges(n4,n5);

        graph.traverse(n2);
    }
}

class Graph<E> {

    private ArrayList<Node> nodes = new ArrayList<>(); //Список узлов графа
    private ArrayList<Pair<Node, Node>> edges = new ArrayList<>(); //Список ребер графа

    class Node {

        private E value;
        private ArrayList<Node> childs = new ArrayList<>();

        boolean visited = false;

        public Node(E value) {
            this.value = value;
        }

        public void addChild(Node child) {
            childs.add(child);
            child.childs.add(this);
        }
    }

    public void addNode(Node node) {
        nodes.add(node);

    }

    public void addEdges(Node node1, Node node2) {
        edges.add(new Pair<>(node1, node2));
        node1.addChild(node2);
    }

    public void setVisited(boolean visited) {
        for (Node node : nodes) {
            node.visited = visited;
        }
    }

    public void traverse(Node node) {
        if (node.visited) return;
        System.out.println(node.value);
        node.visited = true;
        for (Node node1 : nodes) {
            traverse(node1);
        }
    }


}

class Pair<S, T> {
    private S first;
    private T second;

    public Pair(S first, T second) {
        this.first = first;
        this.second = second;
    }

    public S getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }
}