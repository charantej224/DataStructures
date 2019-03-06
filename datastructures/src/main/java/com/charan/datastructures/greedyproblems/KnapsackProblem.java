package com.charan.datastructures.greedyproblems;

public class KnapsackProblem {

	public static void main(String[] args) {
		int[] weights = { 10, 20, 30 };
		int[] values = { 60, 100, 120 };
		int acceptableLimt = 50;
		System.out.println(knapsack(weights, values, acceptableLimt));
	}

	private static float knapsack(int[] weights, int[] values, int acceptableLimt) {
		float sumValue = 0;
		float[] unitArray = new float[weights.length];
		int[] positionArray = new int[weights.length];
		setupIndex(unitArray,weights,values);
		while(acceptableLimt > 0) {
			int index = getMaxIndex(unitArray,positionArray);
			if(acceptableLimt >= weights[index]) {
				sumValue = sumValue + values[index];
				acceptableLimt = acceptableLimt - weights[index];
			} else if (acceptableLimt < weights[index]) {
				sumValue = sumValue + acceptableLimt * unitArray[index];
				acceptableLimt = 0;
			}
		}
		return sumValue;
	}

	private static void setupIndex(float[] unitArray, int[] weights, int[] values) {
		// TODO Auto-generated method stub
		for(int i = 0; i<weights.length ;i++) {
			unitArray[i] = values[i]/weights[i];
		}
		
	}

	private static int getMaxIndex(float[] unitArray, int[] positionArray) {
		int index = -1;
		float maxValue = 0;
		for(int i = 0;i< unitArray.length;i++) {
			if(unitArray[i] > maxValue && positionArray[i] > -1) {
				index = i;
				maxValue = unitArray[i];
			}
		}
		if(index >= 0)
			positionArray[index] = -1;
		else 
			throw new IllegalArgumentException("exhasuted list and requesting for more");
		
		return index;
	}

}
