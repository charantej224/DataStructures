package com.charan.datastructures.leetcode;

public class Problem3 {

    public int lengthOfLongestSubstring(String s) {
        char[] charArray = s.toCharArray();
        int maxCount = 0;
        int i = 0;
        int startingIndex = 0;
        while (i < charArray.length) {
            boolean isMatched = false;
            char toSearch = charArray[i];
            int j = i;
            while (j >= startingIndex) {
                if (i == j) {
                    j = j - 1;
                    continue;
                }
                if (charArray[j] == toSearch) {
                    isMatched = true;
                    startingIndex = j + 1;
                    break;
                }
                j--;
            }
            if (!isMatched) {
                maxCount = (i + 1 - startingIndex) > maxCount ? (i + 1 - startingIndex) : maxCount;
            } else if (isMatched)
                maxCount = (i - j) > maxCount ? (i - j) : maxCount;
            i++;
        }
        return maxCount;
    }

    public static void main(String[] args) {
        Problem3 problem3 = new Problem3();
        System.out.println(problem3.lengthOfLongestSubstring("cdd"));
    }

    // abcabcbb
    // bbbbb
    // pwwkew
    // au
    // dvdf
    // cdd

}
