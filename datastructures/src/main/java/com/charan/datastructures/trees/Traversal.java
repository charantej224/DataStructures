package com.charan.datastructures.trees;

import java.util.ArrayList;
import java.util.List;

class Traversal {
    static List<Integer> returnList = new ArrayList<>();

    public static void main(String[] args) {
        TreeNode root = create();
        postorderTraversal(root);
        System.out.println("something");
        returnList.forEach(System.out::println);
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        if (null != root.left) {
            inorderTraversal(root.left);
        }
        returnList.add(root.val);
        if (null != root.right) {
            inorderTraversal(root.right);
        }
        return returnList;
    }


    public static List<Integer> preorderTraversal(TreeNode root) {
        returnList.add(root.val);
        if (null != root.left) {
            preorderTraversal(root.left);
        }
        if (null != root.right) {
            preorderTraversal(root.right);
        }
        return returnList;
    }

    public static List<Integer> postorderTraversal(TreeNode root) {

        if (null != root.left) {
            postorderTraversal(root.left);
        }
        if (null != root.right) {
            postorderTraversal(root.right);
        }
        returnList.add(root.val);
        return returnList;
    }

    public static TreeNode create() {
        TreeNode root = new TreeNode(40);
        root.left = new TreeNode(20);
        root.left.left = new TreeNode(10);
        root.left.left.left = new TreeNode(5);
        root.left.right = new TreeNode(30);
        root.right = new TreeNode(50);
        root.right.right = new TreeNode(60);
        root.left.right.left = new TreeNode(67);
        root.left.right.right = new TreeNode(78);
        return root;
    }

}