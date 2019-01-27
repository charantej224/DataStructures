package com.charan.datastructures.lists;

public class LinkedList<T extends Comparable> {

    Node<T> headNode;
    Node<T> tailNode;
    int counter;


    public void add(T t){
        Node<T> node = new Node<T>();
        node.setT(t);
        if(counter == 0){
            headNode = node;
            tailNode = node;
        } else {
            tailNode.setNode(node);
            tailNode = node;
        }
        counter++;
    }

    public T removeFirst(){
        if(headNode == null){
            throw new IllegalStateException();
        }
        Node<T> temp = headNode;
        headNode = headNode.getNode();
        return temp.getT();
    }

    public Node<T> addFirst(T t){
        Node<T> temp = headNode;
        Node<T> node = new Node<T>();
        node.setT(t);
        headNode = node;
        headNode.setNode(temp);
        return temp;
    }

    public T getFirstNode(){
        if(headNode == null){
            throw new IllegalStateException();
        }
        return headNode.getT();
    }

    public void priortyPush(T t){
        if(null == headNode){
            add(t);
            return;
        }
        Node<T> node = new Node<T>();
        node.setT(t);
        Node<T> tempNode = headNode;
        if(headNode.getT().compareTo(t) < 0){
            node.setNode(headNode);
            headNode = node;
            return;
        }
        boolean flag = true;
        while(flag){
            if(null == tempNode.getNode() || tempNode.getNode().getT().compareTo(t) < 0 ){
                node.setNode(tempNode.getNode());
                tempNode.setNode(node);
                flag = false;
            } else tempNode = tempNode.getNode();
        }
    }



    @Override
    public String toString(){
        String value = "";
        Node<T> temp = headNode;
        if(headNode == tailNode){
            value = value + headNode.getNode().getT().toString();
        } else{
            while (temp.getNode() != tailNode){
                value = value + temp.getNode().getT().toString();
                temp = temp.getNode();
            }
        }
        return value;
    }



}
