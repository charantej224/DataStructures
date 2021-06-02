package com.charan.datastructures.trees;

/***
 * https://www.codesdope.com/course/algorithms-heapsort/
 */
public class HeapSort {


    public static void buildHeap() {
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
