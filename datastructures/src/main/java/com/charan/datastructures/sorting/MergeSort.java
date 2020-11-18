package com.charan.datastructures.sorting;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {

    static MergeSort mergeSort = new MergeSort();

    public static void main(String[] args) {
        mergeSort.sort(mergeSort.init(5));
    }

    private void sort(int[] init) {

        auxSort(init, 0, init.length - 1);
        shuffle(init, 0, init.length - 1);
        System.out.println(Arrays.toString(init));
    }

    private void auxSort(int[] init, int low, int high) {
        int mid = (low + high) / 2;
        if (low < mid) {
            auxSort(init, low, mid);
            shuffle(init, low, mid);
        } else if (mid < high) {
            auxSort(init, mid + 1, high);
            shuffle(init, mid + 1, high);
        }
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

    private void shuffle(int[] init, int lower, int upper) {
        System.out.println(lower + " - " + upper);
        int temp = 0;
        for (int i = lower; i <= upper; i++) {
            for (int j = i + 1; j <= upper; j++) {
                if (init[i] > init[j]) {
                    temp = init[j];
                    init[j] = init[i];
                    init[i] = temp;

                }
            }

        }
    }

}
