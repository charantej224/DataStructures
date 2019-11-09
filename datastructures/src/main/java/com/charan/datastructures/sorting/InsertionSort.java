package com.charan.datastructures.sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] inputArray = {5, 6, 7, 1, 3, 45, 76};
        insertionSort(inputArray);
        System.out.println(Arrays.toString(inputArray));

    }

    private static void insertionSort(int[] inputArray) {
        for (int i = 1; i < inputArray.length; i++) {
            boolean swap = false;
            int saved = 0;
            for (int j = 0; j <= i - 1; j++) {
                if (swap) {
                    int temp = inputArray[j];
                    inputArray[j] = saved;
                    saved = temp;
                    if(j+1 == i){
                        inputArray[j+1] = saved;
                    }
                    continue;
                }
                if (inputArray[j] > inputArray[i]) {
                    swap = true;
                    saved = inputArray[j + 1];
                    inputArray[j + 1] = inputArray[j];
                    inputArray[j] = inputArray[i];
                    j++;
                }
            }
        }
    }
}