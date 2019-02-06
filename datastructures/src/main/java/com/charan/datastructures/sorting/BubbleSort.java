package com.charan.datastructures.sorting;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = { 64, 25, 12, 22, 11 };
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void bubbleSort(int[] integerArray) {
		for(int i = 0;i < integerArray.length-1; i++) {
			for(int j = 0; j < integerArray.length -1 ;j++) {
				if(integerArray[j] > integerArray[j+1]) {
					int temp = integerArray[j];
					integerArray[j] = integerArray[j+1];
					integerArray[j+1] = temp;
					
				}
			}
		}
	}
}
