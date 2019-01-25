package com.charan.datastructures.leetcode;

import java.util.Arrays;

public class Problem1 {

    public int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int findNum = target - nums[i];
            for (int j = 0; j < nums.length; j++) {
                if (i != j && findNum == nums[j]) {
                    indices[0] = i;
                    indices[1] = j;
                    return indices;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Problem1 problem1 = new Problem1();
        int[] nums = {2, 7, 11, 15};
        int[] indices = problem1.twoSum(nums, 9);
        System.out.println(Arrays.toString(indices));

    }

}
