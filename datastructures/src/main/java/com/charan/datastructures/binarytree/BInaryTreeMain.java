package com.charan.datastructures.binarytree;

public class BInaryTreeMain {

	public static void main(String[] args) {
		BinaryTreeSetup binaryTreeSetup = new BinaryTreeSetup();
		BinaryTree<Integer> binaryTree = binaryTreeSetup.setupDefinedValues();
		BinaryTree<Integer> binaryTree1 = binaryTreeSetup.setupRandomValues();

		BinaryTreeTraverser<Integer> binaryTreeTraverser = new BinaryTreeTraverser<Integer>();
		int searchKey = 42;

		binaryTreeTraverser.setBinaryTree(binaryTree);
		System.out.println("-----------------------");
		binaryTreeTraverser.traverseInOrder();
		System.out.println("-----------------------");
		binaryTreeTraverser.traversePreOrder();
		System.out.println("-----------------------");
		binaryTreeTraverser.traversePostOrder();
		System.out.println("-----------------------");
		System.out.println("search key:- " + searchKey);
		if (binaryTreeTraverser.search(searchKey)) {
			System.out.println("search key found!!!");
		} else {
			System.out.println("search key not found!!!");
		}
		
		BinaryTreeProblems<Integer> binaryTreeProblems = new BinaryTreeProblems<Integer>();
		System.out.println(binaryTreeProblems.maxDepth(binaryTree.getHeadNode()));

		int ldepth = binaryTreeProblems.maxDepth(binaryTree.getHeadNode().getLeftNode());
		int rdepth = binaryTreeProblems.maxDepth(binaryTree.getHeadNode().getRightNode());
		System.out.println(2 + ldepth + rdepth);

		boolean result = binaryTreeProblems.isIdentical(binaryTree.getHeadNode(), binaryTree.getHeadNode());
		System.out.println(result);
		result = binaryTreeProblems.isIdentical(binaryTree.getHeadNode(), binaryTree1.getHeadNode());
		System.out.println(result);
		binaryTreeProblems.deleteNode(binaryTree.getHeadNode(),42);
		binaryTreeTraverser.traverseInOrder();
	}
}
