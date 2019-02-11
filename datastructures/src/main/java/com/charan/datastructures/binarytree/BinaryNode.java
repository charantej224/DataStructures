package com.charan.datastructures.binarytree;

public class BinaryNode<T extends Comparable> {

	private T value;
	private BinaryNode<T> leftNode;
	private BinaryNode<T> rightNode;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public BinaryNode<T> getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(BinaryNode<T> leftNode) {
		this.leftNode = leftNode;
	}

	public BinaryNode<T> getRightNode() {
		return rightNode;
	}

	public void setRightNode(BinaryNode<T> rightNode) {
		this.rightNode = rightNode;
	}

}
