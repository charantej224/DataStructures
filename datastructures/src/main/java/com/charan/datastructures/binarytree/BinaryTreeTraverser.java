package com.charan.datastructures.binarytree;

import java.awt.HeadlessException;

public class BinaryTreeTraverser<T extends Comparable> {

	private BinaryTree<T> binaryTree;

	public BinaryTree<T> getBinaryTree() {
		return binaryTree;
	}

	public void setBinaryTree(BinaryTree<T> binaryTree) {
		this.binaryTree = binaryTree;
	}

	public void traverseInOrder() {
		printInOrder(binaryTree.getHeadNode());
	}

	public void traversePreOrder() {
		printPreOrder(binaryTree.getHeadNode());
	}

	public void traversePostOrder() {
		printPostOrder(binaryTree.getHeadNode());
	}

	private void printPostOrder(BinaryNode<T> headNode) {
		if (headNode == null)
			return;
		printPostOrder(headNode.getLeftNode());
		printPostOrder(headNode.getRightNode());
		System.out.println(headNode.getValue());
	}

	private void printPreOrder(BinaryNode<T> headNode) {
		if (headNode == null)
			return;
		System.out.println(headNode.getValue());
		printPreOrder(headNode.getLeftNode());
		printPreOrder(headNode.getRightNode());

	}

	private void printInOrder(BinaryNode<T> headNode) {
		if (null == headNode)
			return;

		printInOrder(headNode.getLeftNode());
		System.out.println(headNode.getValue());
		printInOrder(headNode.getRightNode());

	}

	public boolean search(T value) {
		BinaryNode<T> binaryNode = binaryTree.getHeadNode();
		while (true) {
			if (binaryNode == null) {
				return false;
			}
			if (value.compareTo(binaryNode.getValue()) == 0) {
				return true;
			} else if (value.compareTo(binaryNode.getValue()) < 0) {
				binaryNode = binaryNode.getLeftNode();
			} else if (value.compareTo(binaryNode.getValue()) > 0) {
				binaryNode = binaryNode.getRightNode();
			}
		}
	}
}
