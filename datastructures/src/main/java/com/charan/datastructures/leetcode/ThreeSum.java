package com.charan.datastructures.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	public List<List<Integer>> threeSum(int[] nums) {
		int sum = 0;
		List<Integer> integerList;
		List<List<Integer>> finalList = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		if(nums.length == 3) {
			if(nums[0] + nums[1] + nums[2] == 0) {
				integerList = new ArrayList<Integer>();
				integerList.add(nums[0]);
				integerList.add(nums[1]);
				integerList.add(nums[2]);
				finalList.add(integerList);
				return finalList;
			}
			
		}
		int min = 0;
		int max = nums.length - 1;
		while (min + 1 < max - 1) {
			int sumWithMin = nums[min] + nums[min + 1] + nums[max];
			int sumWithMax = nums[min] + nums[max - 1] + nums[max];
			if (sumWithMin == 0) {
				integerList = new ArrayList<Integer>();
				integerList.add(nums[min]);
				integerList.add(nums[min + 1]);
				integerList.add(nums[max]);
				finalList.add(integerList);
				max = max - 1;
			} else if (sumWithMax == 0) {
				integerList = new ArrayList<Integer>();
				integerList.add(nums[min]);
				integerList.add(nums[max - 1]);
				integerList.add(nums[max]);
				finalList.add(integerList);
				min = min + 1;
			} else if (sumWithMin < 0) {
				min = min + 1;
			}else if (sumWithMin > 0) {
				max = max -1;
			}
		}
		return finalList;
	}

	public static void main(String[] args) {

		ThreeSum threeSum = new ThreeSum();
		int[] nums = { -2, 0, 1, 1, 2 };
		System.out.println(threeSum.threeSum(nums));
		int[] nums1 = { -1,0,1,2,-1,-4 };
		System.out.println(threeSum.threeSum(nums1));
		int[] nums2 = { 0,0,0 };
		System.out.println(threeSum.threeSum(nums2));

	}
}
