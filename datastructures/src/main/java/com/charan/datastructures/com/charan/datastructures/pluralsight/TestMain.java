package com.charan.datastructures.com.charan.datastructures.pluralsight;

public class TestMain {

    public static void main(String[] args){
        Integer a;
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        a = stack.peek();
        a = stack.pop();
        a = stack.pop();
        a = stack.pop();
        a = stack.pop();
        a = stack.pop();

        ArrayStack arrayStack = new ArrayStack();
        int i = 0;
        while(i< 50){
            arrayStack.push(i);
            i++;
        }
        i = 0;
        while(i< 50){
            System.out.println(arrayStack.pop());
            i++;
        }


    }

}
