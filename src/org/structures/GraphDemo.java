package org.structures;

import org.w3c.dom.Node;

import java.util.ArrayList;

public class GraphDemo {
    public static void main(String[] args) {

    }
}

class Graph<E> {

    class node {
        private E obj;
        private ArrayList<Node> childs = new ArrayList<>();
        private boolean visited = false;

        public node(E obj) {
            this.obj = obj;
        }
        public void addChild (Node childs){
            childs.addChild(childs);
        }
    }
}