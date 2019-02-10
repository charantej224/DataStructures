package com.charan.datastructures.sorting;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = { 64, 25, 12, 22, 11 };
		int[] arr1 = { 64, 25, 12, 22, 11, 40, 120, 2, 3, 230 };
		System.out.println(Arrays.toString(arr));
		// quickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr1));
		//quickSort(arr1, 0, arr1.length - 1);
		sort(arr1,0,arr1.length-1);
		System.out.println(Arrays.toString(arr1));
	}


	private static void swapNumbers(int[] integerArray, int leftPointer, int rightPointer) {
		int temp = integerArray[leftPointer];
		integerArray[leftPointer] = integerArray[rightPointer];
		integerArray[rightPointer] = temp;
	}
	
	public static int partition(int arr[], int low, int high) 
    { 
        int pivot = arr[high];  
        int i = (low-1); // index of smaller element 
        for (int j=low; j<high; j++) 
        { 
            // If current element is smaller than or 
            // equal to pivot 
            if (arr[j] <= pivot) 
            { 
                i++; 
                swapNumbers(arr,i,j);
            } 
        } 
  
        // swap arr[i+1] and arr[high] (or pivot) 
        swapNumbers(arr,i+1,high);
        return i+1; 
    } 
	
	public static void sort(int arr[], int low, int high) 
    { 
        if (low < high) 
        { 
            /* pi is partitioning index, arr[pi] is  
              now at right place */
            int pi = partition(arr, low, high); 
  
            // Recursively sort elements before 
            // partition and after partition 
            sort(arr, low, pi-1); 
            sort(arr, pi+1, high); 
        } 
    } 

}
