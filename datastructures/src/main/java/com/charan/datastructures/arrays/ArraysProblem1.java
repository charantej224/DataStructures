package com.charan.datastructures.arrays;

import com.charan.datastructures.math.MathOperations;

import javax.swing.*;
import java.util.Arrays;

/**
 * problem statement : https://www.geeksforgeeks.org/array-rotation/
 */
public class ArraysProblem1 {

    private static int[] inputArrayForRotation = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static void main(String[] args) {
        //rotateArraySolution1(inputArrayForRotation, 3);
        //System.out.println(Arrays.toString(inputArrayForRotation));

        int[] outputArray = rotateArraySolution3(inputArrayForRotation,3);
        System.out.println(Arrays.toString(outputArray));
    }

    /*
    * solution 1 - working -
    * O(n * n) - time complexity.
    * O(1) space complexity
     */

    public static void rotateArraySolution1(int[] inputArray, int numberOfElementsSkip) {
        for (; numberOfElementsSkip > 0; numberOfElementsSkip--) {
            rotateByOne(inputArray);
        }
    }

    public static void rotateByOne(int[] inputArray) {
        int temp = 0;
        for (int i = 0; i < inputArray.length - 1; i++) {
            if (i == 0) {
                temp = inputArray[i];
            }
            inputArray[i] = inputArray[i + 1];
        }
        inputArray[inputArray.length - 1] = temp;
    }


    /*
     * solution 2 - working -
     * O(n) - time complexity.
     * O(n) - space complexity
     */

    public static int[] rotateArraySolution2(int[] inputArray, int numberOfElementsSkip){
        int[] outputArray = new int[inputArray.length];
        int outputIndex = 0;
        while (true){
            outputArray[outputIndex] = inputArray[numberOfElementsSkip];
            outputIndex++;
            numberOfElementsSkip++;
            if(numberOfElementsSkip >= inputArray.length)
                numberOfElementsSkip = 0;
            if(outputIndex >= inputArray.length)
                break;
        }
        return outputArray;
    }

    /*
     * Solution 3
     * O(n) - time complexity
     * O(1) - space complexity
     */
    public static int[] rotateArraySolution3(int[] inputArray,int numberOfElementsSkip){
        MathOperations mathOperations = new MathOperations();
        int endCounter = mathOperations.greatestCommonFactor(numberOfElementsSkip,inputArray.length);
        for (int counter = 0;counter < endCounter; counter++){
            int tempCounter = counter;
            while (tempCounter + endCounter < inputArray.length){
                int temp = inputArray[tempCounter];
                inputArray[tempCounter] = inputArray[tempCounter + endCounter];
                inputArray[tempCounter + endCounter] = temp;
                tempCounter += endCounter;
            }
        }
        return inputArray;
    }
}
