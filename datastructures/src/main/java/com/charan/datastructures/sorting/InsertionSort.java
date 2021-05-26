package com.charan.datastructures.sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] inputArray = {5, 6, 7, 1, 3, 45, 76};
        insertionSort(inputArray);
        System.out.println(Arrays.toString(inputArray));

    }

    private static void insertionSort(int[] inputArray) {
        int n = inputArray.length;
        for (int i = 1; i < n; ++i) {
            int key = inputArray[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && inputArray[j] > key) {
                inputArray[j + 1] = inputArray[j];
                j = j - 1;
            }
            inputArray[j + 1] = key;
        }
    }
}