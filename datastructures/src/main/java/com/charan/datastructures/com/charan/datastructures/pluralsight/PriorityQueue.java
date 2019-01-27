package com.charan.datastructures.com.charan.datastructures.pluralsight;

import com.charan.datastructures.lists.LinkedList;

public class PriorityQueue<T extends Comparable> {

    LinkedList<T> linkedList = new LinkedList();

    public void queue(T t){
        linkedList.priortyPush(t);
    }

    public T dequeue(){
       return linkedList.removeFirst();
    }

}
