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

	public boolean deleteNode(BinaryNode<T> node, T t) {
		if(node == null) {
			return false;
		}
		
		if (node.getValue().compareTo(t) == 0) {
			if (node.getLeftNode() == null && node.getRightNode() == null) {
				node = null;
				return true;
			} else if (node.getLeftNode() == null) {
				node = node.getRightNode();
				return true;
			} else if (node.getRightNode() == null) {
				node = node.getLeftNode();
				return true;
			} else {
				BinaryNode<T> leftMostNode = getLeftMostNode(node.getRightNode());
				node.setValue(leftMostNode.getValue());
				leftMostNode = leftMostNode.getRightNode();
				return true;
			}
		} else {
			deleteNode(node.getLeftNode(),t);
			deleteNode(node.getRightNode(),t);
		}
		return false;

	}

	public BinaryNode<T> getLeftMostNode(BinaryNode<T> node) {
		if (node == null) {
			return node;
		} else if (node.getLeftNode() == null) {
			return node;
		} else {
			return getLeftMostNode(node.getLeftNode());
		}
	}

	public BinaryNode<T> getRightMostNode(BinaryNode<T> node) {
		if (node == null) {
			return node;
		} else if (node.getRightNode() == null) {
			return node;
		} else {
			return getRightMostNode(node.getLeftNode());
		}
	}
}
