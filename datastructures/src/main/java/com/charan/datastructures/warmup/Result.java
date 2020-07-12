package com.charan.datastructures.warmup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        int rightI = 0;
        int rightJ = arr.size() - 1;
        int leftI = 0;
        int leftJ = 0;
        int rightSum = 0, leftSum = 0;
        for (int counter = 0; counter < arr.size(); counter++) {
            leftSum = leftSum + arr.get(leftI).get(leftJ);
            rightSum = rightSum + arr.get(rightI).get(rightJ);
            System.out.println(leftI + " - " + leftJ + " - " + rightI + " - " + rightJ);
            leftI += 1;
            leftJ += 1;
            rightI += 1;
            rightJ -= 1;
        }
        int diagnalSum = leftSum - rightSum;
        if (diagnalSum < 0)
            return diagnalSum * -1;
        else
            return diagnalSum;
    }

    public static void main(String[] args) {
        List<List<Integer>> intList = new ArrayList<>();
        List<Integer> insideList1 = new ArrayList<>();
        insideList1.add(11);insideList1.add(2);insideList1.add(4);
        List<Integer> insideList2 = new ArrayList<>();
        insideList2.add(4);insideList2.add(5);insideList2.add(6);
        List<Integer> insideList3 = new ArrayList<>();
        insideList3.add(10);insideList3.add(8);insideList3.add(-12);
        intList.add(insideList1);
        intList.add(insideList2);
        intList.add(insideList3);
        System.out.println(diagonalDifference(intList));
    }

}
