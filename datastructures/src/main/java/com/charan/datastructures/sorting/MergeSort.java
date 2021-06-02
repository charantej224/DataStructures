package com.charan.datastructures.sorting;

//https://www.geeksforgeeks.org/merge-sort/

import java.util.Arrays;
import java.util.Random;

public class MergeSort {

    static MergeSort mergeSort = new MergeSort();

    public static void main(String[] args) {
        int[] inputArray = mergeSort.init(10);
        mergeSort.sort(inputArray, 0, 9);
        System.out.println(Arrays.toString(inputArray));
    }

    private int[] init(int i) {
        Random random = new Random();
        int[] intArray = new int[i];
        for (int j = 0; j < i; j++) {
            intArray[j] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(intArray));
        return intArray;
    }

    public void sort(int inputArray[], int leftValue, int rightValue) {
        if (leftValue >= rightValue) {
            return;
        }
        int midValue = (leftValue + rightValue) / 2;
        sort(inputArray, leftValue, midValue);
        sort(inputArray, midValue + 1, rightValue);
        auxMerge(inputArray, leftValue, midValue, rightValue);
    }

    private void auxMerge(int[] inputArray, int leftValue, int midValue, int rightValue) {
        int ln = midValue - leftValue + 1;
        int rn = rightValue - midValue;
        int[] leftArray = new int[ln];
        int[] rightArray = new int[rn];
        int leftCounter = 0, rightCounter = 0;
        int counter = leftValue;
        System.out.println(leftValue + " - " + rightValue + " - " + midValue);
        for (; counter <= rightValue; counter++) {
            if (leftCounter < ln) {
                leftArray[leftCounter] = inputArray[counter];
                leftCounter++;
            } else if (leftCounter >= ln && rightCounter < rn) {
                rightArray[rightCounter] = inputArray[counter];
                rightCounter++;
            }
        }
        leftCounter = 0;
        rightCounter = 0;
        counter = leftValue;

        while (leftCounter < ln && rightCounter < rn) {
            if (leftArray[leftCounter] <= rightArray[rightCounter]) {
                inputArray[counter] = leftArray[leftCounter];
                leftCounter++;
            } else if (leftArray[leftCounter] >= rightArray[rightCounter]) {
                inputArray[counter] = rightArray[rightCounter];
                rightCounter++;
            }
            counter++;
        }

        while (leftCounter < ln) {
            inputArray[counter] = leftArray[leftCounter];
            leftCounter++;
            counter++;
        }
        while (rightCounter < rn) {
            inputArray[counter] = rightArray[rightCounter];
            rightCounter++;
            counter++;
        }

    }


}
