package com.charan.datastructures.leetcode;

public class Problem5 {

    public static String longestPalindrome(String s) {
        String sD = reverseString(s);
        int maxLength = 0, tempLength = 0;
        String palindrome = "", temp = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == sD.charAt(i)) {
                temp = temp + s.charAt(i);
                tempLength++;
            } else {
                if (maxLength < tempLength) {
                    maxLength = tempLength;
                    tempLength = 0;
                    palindrome = temp;
                    temp = "";
                }
            }
        }
        if ("".equalsIgnoreCase(palindrome)) {
            palindrome = temp;
        }
        if ("".equalsIgnoreCase(palindrome)) {
            palindrome = palindrome + s.charAt(0);
        }
        return palindrome;
    }

    public static void main(String[] args) {
        String s = "bb";
        System.out.println(longestPalindrome(s));
        s = "babad";
        System.out.println(longestPalindrome(s));
        s = "cbbd";
        System.out.println(longestPalindrome(s));
        s = "a";
        System.out.println(longestPalindrome(s));
    }

    public static String reverseString(String input) {
        String output = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            output = output + input.charAt(i);
        }
        return output;
    }

    public static boolean checkIfPalindrome(String s, int start, int end) {
        boolean flag = false;
        while (true) {
            if (start >= end) {
                flag = true;
                break;
            }
            if (s.charAt(start) != s.charAt(end)) {
                flag = false;
                break;
            }
            start++;
            end--;
        }
        return flag;
    }
}
