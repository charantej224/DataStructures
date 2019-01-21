package com.charan.datastructures.lists;

public class LinkedListMain {

    public static void main(String[] args) {
        LinkedList<Integer> integerLinkedList = new LinkedList<Integer>();
        Node<Integer> intNode = new Node<Integer>();
        intNode.setT(10);
        intNode = new Node<Integer>();
        intNode.setT(20);
        intNode = new Node<Integer>();
        intNode.setT(30);
        intNode = new Node<Integer>();
        intNode.setT(40);
        System.out.println(intNode.toString());
        intNode.toString();
    }
}
