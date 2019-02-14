package com.charan.datastructures.binarytree;

import java.util.Random;

public class BinaryTreeSetup {

	public BinaryTree<Integer> setupRandomValues() {
		BinaryTree<Integer> binaryTree = new BinaryTree<Integer>();
		Random random = new Random();
		int i = 0;
		while (i < 10) {
			int value = random.nextInt(100);
			System.out.println(value);
			binaryTree.add(value);
			i++;
		}
		return binaryTree;
	}

	public BinaryTree<Integer> setupDefinedValues() {
		BinaryTree<Integer> binaryTree = new BinaryTree<Integer>();
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
		return binaryTree;
	}
}
