package com.charan.datastructures.binarytree;

import java.util.Random;

public class BInaryTreeMain {
	
	private static Random random = new Random();

	public static void main(String[] args) {
		BinaryTree<Integer> binaryTree = new BinaryTree<Integer>();
		BinaryTreeTraverser<Integer> binaryTreeTraverser = new BinaryTreeTraverser<Integer>();
		
		int i =0;
		while(i<5) {
			int value = random.nextInt(100);
			System.out.println(value);
			binaryTree.add(value);
			i++;
		}
		
		binaryTreeTraverser.setBinaryTree(binaryTree);
		System.out.println("-----------------------");
		binaryTreeTraverser.traverseInOrder();
		System.out.println("-----------------------");
		binaryTreeTraverser.traversePreOrder();
		System.out.println("-----------------------");
		binaryTreeTraverser.traversePostOrder();
		
	}
}
