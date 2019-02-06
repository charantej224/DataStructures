package com.charan.datastructures.sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 64, 25, 12, 22, 11 };
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void selectionSort(int[] integerArray) {
		for(int i = 0;i < integerArray.length; i++) {
			for(int j = i+1; j < integerArray.length ;j++) {
				if(integerArray[i] > integerArray[j]) {
					int temp = integerArray[j];
					integerArray[j] = integerArray[i];
					integerArray[i] = temp;
					
				}
			}
		}
	}

}
