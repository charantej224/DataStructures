package com.charan.datastructures.com.charan.datastructures.pluralsight;

public class ArrayStack {

    int initialSize = 20;
    int[] intArray = new int[initialSize];
    int head;

    public int peek(){
        return intArray[head];
    }

    public int pop(){
        head = head - 1;
        return intArray[head+1];
    }

    public void push(int value){
        if(intArray.length - 1 == head){
            initialSize = 2 * initialSize;
            int[] newIntArray = new int[initialSize];
            for(int i = 0;i< intArray.length;i++){
                newIntArray[i] = intArray[i];
            }
            intArray = newIntArray;
        }
        intArray[head] = value;
        head = head + 1;

    }

}
