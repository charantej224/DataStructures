package com.charan.datastructures.leetcode;

//Given a string, find the length of the longest substring without repeating characters.
//
//Example 1:
//
//Input: "abcabcbb"
//Output: 3 
//Explanation: The answer is "abc", with the length of 3. 
//Example 2:
//
//Input: "bbbbb"
//Output: 1
//Explanation: The answer is "b", with the length of 1.
//Example 3:
//
//Input: "pwwkew"
//Output: 3
//Explanation: The answer is "wke", with the length of 3. 
//             Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
public class LongestSubString {

	public static void main(String[] args) {
		String value = "abcabcbb";
		int maxLength = 0;
		String longestSubString = "";
		for (int i = 0; i < value.length(); i++) {
			String returnValue = getmaxLength(value, i, i);
			if (maxLength < Math.max(maxLength, returnValue.length())) {
				;
				maxLength = Math.max(maxLength, returnValue.length());
				longestSubString = returnValue;
			}
		}
		System.out.println(longestSubString);
		System.out.println(maxLength);
	}

	private static String getmaxLength(String value, int current, int counter) {
		if (value.length() <= counter) {
			return "";
		}
		if ((value.charAt(current) != value.charAt(counter)) || current == counter) {
			return value.charAt(counter) + getmaxLength(value, current, ++counter);
		}

		return "";
	}

}
