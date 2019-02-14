package com.charan.datastructures.binarytree;

public class BinaryTreeProblems<T extends Comparable> {

	private BinaryTree<T> binaryTree;

	public BinaryTree<T> getBinaryTree() {
		return binaryTree;
	}

	public void setBinaryTree(BinaryTree<T> binaryTree) {
		this.binaryTree = binaryTree;
	}

	public int maxDepth(BinaryNode<T> node) {
		if (node == null)
			return 0;
		else {
			int lDepth = maxDepth(node.getLeftNode());
			int rDepth = maxDepth(node.getRightNode());

			if (lDepth > rDepth)
				return (lDepth + 1);
			else
				return (rDepth + 1);
		}
	}

	public boolean isIdentical(BinaryNode<T> node1, BinaryNode<T> node2) {
		if (node1 == null && node2 == null) {
			return true;
		}
		return (node1.getValue() == node2.getValue()) && (isIdentical(node1.getLeftNode(), node2.getLeftNode()))
				&& (isIdentical(node1.getRightNode(), node2.getRightNode()));
	}
}
