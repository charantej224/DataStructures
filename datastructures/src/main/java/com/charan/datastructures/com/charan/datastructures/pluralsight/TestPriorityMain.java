package com.charan.datastructures.com.charan.datastructures.pluralsight;

public class TestPriorityMain {

    public static void main(String[] args){
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
        priorityQueue.queue(20);
        priorityQueue.queue(10);
        priorityQueue.queue(30);
        priorityQueue.queue(5);

        System.out.println(priorityQueue.dequeue());
        System.out.println(priorityQueue.dequeue());
        System.out.println(priorityQueue.dequeue());
        System.out.println(priorityQueue.dequeue());
    }
}
