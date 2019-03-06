package com.charan.datastructures.leetcode;

public class PrimeNumber {

	public static boolean checkPrime(int number) {
		if(number == 2) {
			return true;
		}
		if (number == 0 || number == 1 || number % 2 == 0) {
			return false;
		} else {
			int i = 3;
			boolean flag = true;
			while (i < number) {
				i = 2 * i + 1;
				if (number % i == 0) {
					return false;
				}
			}

		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(checkPrime(33));
		System.out.println(checkPrime(256));
		System.out.println(checkPrime(2));
		System.out.println(checkPrime(12345679));
	}
	
}
