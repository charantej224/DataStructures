package com.charan.datastructures.com.charan.datastructures.pluralsight;

import com.charan.datastructures.lists.LinkedList;

public class Stack<T> {

    LinkedList<T> linkedList = new LinkedList<T>();

    public boolean push(T t){
        boolean flag = false;
        linkedList.addFirst(t);
        flag = true;
        return flag;
    }

    public T pop(){
        return linkedList.removeFirst();
    }

    public T peek(){
        return linkedList.getFirstNode();
    }

}
