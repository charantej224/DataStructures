package com.charan.datastructures.sorting;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] inputArray = {22, 4, 14, 7, 15, 10, 27, 12};
        quickSort(inputArray, 0, inputArray.length - 1);
        System.out.println(Arrays.toString(inputArray));
    }

    private static void quickSort(int[] inputArray, int low, int high) {
        int pivotPosition = high;
        boolean loopFlag = true;
        int i = 0;
        int j = high - 1;
        if (i >= j)
            return;
        while (i < j) {
            if (inputArray[i] > inputArray[pivotPosition] && inputArray[j] < inputArray[pivotPosition]) {
                int temp = inputArray[i];
                inputArray[i] = inputArray[j];
                inputArray[j] = temp;
                i++;
                j--;
            } else if (inputArray[i] < inputArray[pivotPosition]) {
                i++;
            } else if (inputArray[j] > inputArray[pivotPosition]) {
                j--;
            }
        }
        int temp = inputArray[i];
        inputArray[i] = inputArray[pivotPosition];
        inputArray[pivotPosition] = temp;
        pivotPosition = i;

        if (low < pivotPosition - 1)
            quickSort(inputArray, 0, pivotPosition - 1);
        if (pivotPosition + 1 < high)
            quickSort(inputArray, pivotPosition + 1, high);

    }
}
