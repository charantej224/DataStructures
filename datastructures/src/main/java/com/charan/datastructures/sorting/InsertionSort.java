package com.charan.datastructures.sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = { 64, 25, 12, 22, 11 };
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void insertionSort(int[] integerArray) {
		for (int i = 1; i < integerArray.length; i++) {
			for (int j = i; j >= 1; j--) {
				if (integerArray[j] < integerArray[j-1]) {
					int temp = integerArray[j];
					integerArray[j] = integerArray[j-1];
					integerArray[j-1] = temp;

				}
			}
		}

	}
}
