package com.charan.datastructures.leetcode;

import com.charan.datastructures.support.ListNode;

public class Problem2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        boolean flag = true;
        ListNode parent = null;
        ListNode current = null;
        int buffer = 0;

        while (flag) {
            int sum = 0;
            if (null != l1) {
                sum = sum + l1.val;
                l1 = l1.next;
            }
            if (null != l2) {
                sum = sum + l2.val;
                l2 = l2.next;
            }

            if (buffer > 0) {
                sum = sum + buffer;
                buffer = 0;
            }
            if (sum > 9) {
                buffer = 1;
                sum = sum - 10;
            }

            if (null == parent) {
                current = new ListNode(sum);
                parent = current;
            } else {
                current.next = new ListNode(sum);
                current = current.next;
            }


            if ((null == l1 && null == l2) && buffer == 0)
                flag = false;
        }
        return parent;
    }


//    public static void main(String[] args) {
//        ListNode listnode11 = new ListNode(3);
//        ListNode listnode12 = new ListNode(4, listnode11);
//        ListNode listnode13 = new ListNode(2, listnode12);
//        ListNode listnode21 = new ListNode(4);
//        ListNode listnode22 = new ListNode(6, listnode21);
//        ListNode listnode23 = new ListNode(5, listnode22);
//        Problem2 problem2 = new Problem2();
//        ListNode parent = problem2.addTwoNumbers(listnode13, listnode23);
//        System.out.println(parent);
//    }

    //    public static void main(String[] args) {
//        ListNode listnode11 = new ListNode(5);
//        ListNode listnode21 = new ListNode(5);
//        Problem2 problem2 = new Problem2();
//        ListNode parent = problem2.addTwoNumbers(listnode11, listnode21);
//        System.out.println(parent);
//    }

    public static void main(String[] args) {
        ListNode listnode11 = new ListNode(8);
        ListNode listnode12 = new ListNode(1, listnode11);
        ListNode listnode21 = new ListNode(0);
        Problem2 problem2 = new Problem2();
        ListNode parent = problem2.addTwoNumbers(listnode12, listnode21);
        System.out.println(parent);
    }
}
