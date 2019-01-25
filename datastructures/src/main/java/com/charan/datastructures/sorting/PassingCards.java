package com.charan.datastructures.sorting;

public class PassingCards {

    public static void main(String[] args){
        int A[] = {0,1,0,1,1};
        System.out.println(methodCall(A));
    }

    private static int methodCall(int[] a) {
        int MAX_INT = 100000;
        int east = 1;
        int west = 0;
        int pairs = 0;
        for(int val : a){
            if(val != east){
                pairs++;
            } else if (val != west){
                pairs++;
            }
            if(pairs > MAX_INT)
                pairs = -1;
            break;
        }

        return pairs;

    }
}
