package com.charan.datastructures;

public class MainLinkedList {

	private static MainLinkedList linkedList = new MainLinkedList();
	int j = 0;
	private Node childNode = null;
	private static Node headNode;

	public static void main(String[] args) {
		headNode = new Node();
		headNode.setValue(0);
		linkedList.setNodes(19, headNode);
		linkedList.printNodes(headNode);
		linkedList.reverseSingleLinkedList(headNode, null);
		System.out.println("break it" + "\n");
		linkedList.printNodes(headNode);
	}

	private void printNodes(Node headNode) {

		System.out.print(headNode.getValue() + " - ");

		if (headNode.getChildNode() != null) {
			printNodes(headNode.getChildNode());
		}
	}

	private void setNodes(int i, Node node) {

		if (j <= i) {
			childNode = new Node();
			childNode.setValue(j+1);
			node.setChildNode(childNode);
			j++;
			setNodes(i, childNode);
		}

	}
	
	private void reverseSingleLinkedList(Node parent, Node child) {
		Node temp = new Node();
		
		if(child == null) {
			temp = parent.getChildNode();
			parent.setChildNode(null);
			reverseSingleLinkedList(parent, temp);
		} else if(child.getChildNode() == null) {
			child.setChildNode(parent);
			headNode = child;
		} else {
			temp = child.getChildNode();
			child.setChildNode(parent);
			reverseSingleLinkedList(child, temp);
		}
		
		
	}

}
