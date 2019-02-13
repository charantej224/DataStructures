package com.charan.datastructures.recursion;

public class EvenNumbersCheck {

	public static void main(String[] args) {
		int[] intArray = new int[10];
		for (int i = 0; i < 10; i++) {
			intArray[i] = i;
		}
		System.out.println(findEvenNumber(intArray,intArray.length-1));
	}

	private static int findEvenNumber(int[] intArray, int counter) {
		if (counter < 0) {
			return 0;
		}

		if (intArray[counter] % 2 == 0) {
			return 1 + findEvenNumber(intArray, --counter);
		} else {
			return 0 + findEvenNumber(intArray, --counter);
		}
	}

}
