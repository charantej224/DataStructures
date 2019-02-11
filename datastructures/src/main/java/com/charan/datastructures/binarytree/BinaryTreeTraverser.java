package com.charan.datastructures.binarytree;

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
		if(headNode == null)
			return;
		printPostOrder(headNode.getLeftNode());
		printPostOrder(headNode.getRightNode());
		System.out.println(headNode.getValue());
	}

	private void printPreOrder(BinaryNode<T> headNode) {
		if(headNode == null)
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
	
	

}
