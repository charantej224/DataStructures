package com.charan.datastructures.leetcode;

public class Sum {

	/**
	 * Definition for singly-linked list.
	 **/
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int counter = 0;
		int sum = 0;
		while (l1.next != null) {
			int value = (int) Math.pow(10, counter);
			sum = l1.val * value + l2.val * value;
			l1 = l1.next;
			l2 = l2.next;
			counter++;
		}
		ListNode listNode = new ListNode(sum);
		return listNode;
	}
	
	public static void main(String[] args) {
		Sum sum = new Sum();
		//ListNode l1 = new ListNode(2);
		//ListNode l2 = new ListNode(5);
		
		//sum.addTwoNumbers(l1, l2);
	}

}
