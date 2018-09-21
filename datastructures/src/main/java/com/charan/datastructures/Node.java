package com.charan.datastructures;

public class Node {

	Integer value;
	
	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	Node childNode;


	public Node getChildNode() {
		return childNode;
	}

	public void setChildNode(Node childNode) {
		this.childNode = childNode;
	}
	
}
