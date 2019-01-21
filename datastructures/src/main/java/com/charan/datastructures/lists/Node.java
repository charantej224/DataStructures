package com.charan.datastructures.lists;

public class Node<T> {

    private T t;
    private Node<T> node;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public Node<T> getNode() {
        return node;
    }

    public void setNode(Node<T> node) {
        this.node = node;
    }
}
