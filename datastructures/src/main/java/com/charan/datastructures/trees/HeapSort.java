package com.charan.datastructures.trees;

import java.util.Arrays;

/***
 * https://www.codesdope.com/course/algorithms-heapsort/
 */
public class HeapSort {


    public static void main(String[] args) {
/*        //int[] inputArray = {10, 5, 4, 3, 2, 6, 10, 12, 14, 23, 32, 78, 24, 21, 22, 26};
        int[] inputArray = {10, 5, 4, 2, 6, 10, 12, 14, 23, 32, 78, 24, 21, 22, 26};
        maxHeapify(inputArray, inputArray.length / 2 - 1, inputArray.length);
        System.out.println(Arrays.toString(inputArray));
        heapSort(inputArray, inputArray.length);
        System.out.println(Arrays.toString(inputArray));*/
        insertHeapValue(400);
    }

    private static void maxSwap(int[] inputArray, int i, int upperBoundary) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int temp, index = -1;

        if (right < upperBoundary && left < upperBoundary) {
            if (inputArray[right] > inputArray[left] && inputArray[right] > inputArray[i]) {
                index = right;
            } else if (inputArray[left] > inputArray[right] && inputArray[left] > inputArray[i]) {
                index = left;
            } else if (inputArray[left] == inputArray[right] && inputArray[left] > inputArray[i]) {
                index = left;
            }
        } else {
            if (right < upperBoundary && inputArray[right] > inputArray[i]) {
                index = right;
            }
            if (left < upperBoundary && inputArray[left] > inputArray[i]) {
                index = left;
            }
        }
        if (index > 0) {
            temp = inputArray[index];
            inputArray[index] = inputArray[i];
            inputArray[i] = temp;
            maxSwap(inputArray, index, upperBoundary);
        }
    }

    private static void maxHeapify(int[] inputArray, int i, int upperBoundary) {
        if (i >= 0) {
            maxSwap(inputArray, i, upperBoundary);
            maxHeapify(inputArray, --i, upperBoundary);
        }
    }


    public static void heapSort(int[] inputArray, int length) {
        int temp;
        for (int i = length - 1; i > 0; i--) {
            temp = inputArray[i];
            inputArray[i] = inputArray[0];
            inputArray[0] = temp;
            maxHeapify(inputArray, 0, i);
        }
    }

    public static void insertHeapValue(int insertValue) {
        int[] inputArray = {10, 5, 4, 2, 6, 10, 12, 14, 23, 32, 78, 24, 21, 22, 26};
        maxHeapify(inputArray, inputArray.length / 2 - 1, inputArray.length);
        System.out.println(Arrays.toString(inputArray));
        int[] modifiedInputArray = new int[inputArray.length + 1];
        arrayCopy(inputArray, modifiedInputArray);
        modifiedInputArray[inputArray.length] = insertValue;
        upshift(modifiedInputArray, modifiedInputArray.length - 1, modifiedInputArray.length);
        System.out.println(Arrays.toString(modifiedInputArray));
        deleteHeapValue(modifiedInputArray);
        System.out.println(Arrays.toString(modifiedInputArray));
    }

    public static void upshift(int[] inputArray, int inputPlace, int upperBoundary) {
        int indexPlace = ((inputPlace + 1) / 2) - 1;
        int left = 2 * indexPlace + 1;
        int right = 2 * indexPlace + 2;
        int index = -1, temp;

        if (indexPlace < 0)
            return;

        if (right < upperBoundary && left < upperBoundary) {
            if (inputArray[right] > inputArray[left] && inputArray[right] > inputArray[indexPlace]) {
                index = right;
            } else if (inputArray[left] > inputArray[right] && inputArray[left] > inputArray[indexPlace]) {
                index = left;
            } else if (inputArray[left] == inputArray[right] && inputArray[left] > inputArray[indexPlace]) {
                index = left;
            }
        } else {
            if (right < upperBoundary && inputArray[right] > inputArray[indexPlace]) {
                index = right;
            }
            if (left < upperBoundary && inputArray[left] > inputArray[indexPlace]) {
                index = left;
            }
        }
        if (index > 0) {
            temp = inputArray[index];
            inputArray[index] = inputArray[indexPlace];
            inputArray[indexPlace] = temp;
            upshift(inputArray, indexPlace, upperBoundary);
        }

    }

    private static void arrayCopy(int[] sourceArray, int[] destinationArray) {
        for (int i = 0; i < sourceArray.length; i++)
            destinationArray[i] = sourceArray[i];
    }

    public static void deleteHeapValue(int[] inputArray) {
        inputArray[0] = inputArray[inputArray.length - 1];
        maxSwap(inputArray, 0, inputArray.length - 2);

    }

    public static void buildCompleteBinaryTree() {
        int[] inputArray = {10, 20, 25, 6, 12, 15, 4, 16};
        TreeNode parent = new TreeNode(inputArray[0]);
        parent.left = new TreeNode(inputArray[1]);
        parent.right = new TreeNode(inputArray[2]);
        parent.left.left = new TreeNode(inputArray[3]);
        parent.left.right = new TreeNode(inputArray[4]);
        parent.right.left = new TreeNode(inputArray[5]);
        parent.right.right = new TreeNode(inputArray[6]);
        parent.left.left.left = new TreeNode(inputArray[7]);
    }
}
