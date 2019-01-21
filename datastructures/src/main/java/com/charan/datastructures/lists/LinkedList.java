package com.charan.datastructures.lists;

import javax.sound.midi.SysexMessage;

public class LinkedList<T> {

    Node<T> headNode;
    Node<T> tailNode;
    int counter;


    public void add(Node<T> node){
        if(counter == 0){
            headNode = node;
            tailNode = node;
        } else {
            tailNode.setNode(node);
            tailNode = node;
        }
        counter++;
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
