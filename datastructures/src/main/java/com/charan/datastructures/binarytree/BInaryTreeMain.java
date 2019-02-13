package com.charan.datastructures.binarytree;

import java.util.Random;

public class BInaryTreeMain {
	
	private static Random random = new Random();

	public static void main(String[] args) {
		BinaryTree<Integer> binaryTree = new BinaryTree<Integer>();
		BinaryTreeTraverser<Integer> binaryTreeTraverser = new BinaryTreeTraverser<Integer>();
		int searchKey = random.nextInt(100);
//		int i =0;
//		while(i<10) {
//			int value = random.nextInt(100);
//			System.out.println(value);
//			binaryTree.add(value);
//			i++;
//		}
		binaryTree.add(42);
		binaryTree.add(10);
		binaryTree.add(91);
		binaryTree.add(14);
		binaryTree.add(78);
		binaryTree.add(25);
		binaryTree.add(45);
		binaryTree.add(17);
		binaryTree.add(47);
		binaryTree.add(6);
		
		binaryTreeTraverser.setBinaryTree(binaryTree);
		System.out.println("-----------------------");
		binaryTreeTraverser.traverseInOrder();
		System.out.println("-----------------------");
		binaryTreeTraverser.traversePreOrder();
		System.out.println("-----------------------");
		binaryTreeTraverser.traversePostOrder();
		System.out.println("-----------------------");
		System.out.println("search key:- " + searchKey);
		if(binaryTreeTraverser.search(searchKey)) {
			System.out.println("search key found!!!");
		} else {
			System.out.println("search key not found!!!");
		}
		
		BinaryTreeProblems<Integer> binaryTreeProblems = new BinaryTreeProblems<Integer>();
		System.out.println(binaryTreeProblems.maxDepth(binaryTree.getHeadNode()));
		
	}
}
