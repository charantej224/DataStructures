package com.charan.datastructures.sorting;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] inputArray = {10, 5, 4, 2, 6, 10, 12, 14, 23, 32, 78, 24, 21, 22, 26};
        quickSort(inputArray, 0, inputArray.length - 1);
        System.out.println(Arrays.toString(inputArray));
    }

    public static void quickSort(int[] inputArray, int left, int right) {
        if (left >= right)
            return;
        int i = left + 1, j = right;
        int temp;
        int pivot = inputArray[left];


        while (i <= j) {
            if (pivot < inputArray[i] && pivot > inputArray[j]) {
                temp = inputArray[i];
                inputArray[i] = inputArray[j];
                inputArray[j] = temp;
                i++;
                j--;
            }
            if (pivot >= inputArray[i]) {
                i++;
            }
            if (pivot < inputArray[j]) {
                j--;
            }
        }
        inputArray[left] = inputArray[j];
        inputArray[j] = pivot;
        quickSort(inputArray, left, j - 1);
        quickSort(inputArray, j + 1, right);
    }
}
