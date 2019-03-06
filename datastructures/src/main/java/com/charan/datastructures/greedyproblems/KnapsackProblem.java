package com.charan.datastructures.greedyproblems;

public class KnapsackProblem {

	public static void main(String[] args) {
		int[] weights = { 10, 20, 30 };
		int[] values = { 60, 100, 120 };
		int acceptableLimt = 60;
		System.out.println(knapsack(weights, values, acceptableLimt));
	}

	private static float knapsack(int[] weights, int[] values, int acceptableLimt) {
		float sumValue = 0;
		float[] unitArray = new float[weights.length];
		int[] positionArray = new int[weights.length];
		setupIndex(unitArray,weights,values);
		while(acceptableLimt > 0) {
			int index = getMaxIndex(unitArray,positionArray);
			if(acceptableLimt > weights[index]) {
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
		// TODO Auto-generated method stub
		int index = 0;
		float maxValue = 0;
		for(int i = 0;i< unitArray.length;i++) {
			if(unitArray[i] > maxValue && positionArray[i] > -1) {
				index = i;
				maxValue = unitArray[i];
			}
		}
		positionArray[index] = -1;
		return index;
	}

}
