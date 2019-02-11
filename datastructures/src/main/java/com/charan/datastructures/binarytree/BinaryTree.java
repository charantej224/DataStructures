package com.charan.datastructures.binarytree;

import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.TreeMap;

public class BinaryTree<T extends Comparable> {

	private BinaryNode<T> headNode = null;

	public BinaryNode<T> getHeadNode() {
		return headNode;
	}

	public void setHeadNode(BinaryNode<T> headNode) {
		this.headNode = headNode;
	}

	public void add(T value) {
		if (headNode == null) {
			headNode = new BinaryNode<T>();
			headNode.setValue(value);
			return;
		} else
			auxAdd(headNode, value);

	}

	public void auxAdd(BinaryNode<T> node, T value) {
		if(node.getValue().compareTo(value) > 0) {
			if(node.getLeftNode() != null) {
				auxAdd(node.getLeftNode(), value);
			} else {
				BinaryNode<T> leftNode = new BinaryNode<T>();
				leftNode.setValue(value);
				node.setLeftNode(leftNode);
				return;
			}
		} else {
			if(node.getRightNode() != null) {
				auxAdd(node.getRightNode(), value);
			} else {
				BinaryNode<T> rightNode = new BinaryNode<T>();
				rightNode.setValue(value);
				node.setRightNode(rightNode);
				return;
			}
		}
	}
	
	public void topView() { 
		BinaryNode<T> root = headNode;
        class QueueObj { 
            BinaryNode<T> node; 
            int hd; 
  
            QueueObj(BinaryNode node, int hd) { 
                this.node = node; 
                this.hd = hd; 
            } 
        } 
        Queue<QueueObj> q = new LinkedList<QueueObj>(); 
        Map<Integer, BinaryNode<T>> topViewMap = new TreeMap<Integer, BinaryNode<T>>(); 
  
        if (root == null) { 
            return; 
        } else { 
            q.add(new QueueObj(root, 0)); 
        } 
  
        System.out.println("The top view of the tree is : "); 
          
        // count function returns 1 if the container  
        // contains an element whose key is equivalent  
        // to hd, or returns zero otherwise. 
        while (!q.isEmpty()) { 
            QueueObj tmpNode = q.poll(); 
            if (!topViewMap.containsKey(tmpNode.hd)) { 
                topViewMap.put(tmpNode.hd, tmpNode.node); 
            } 
  
            if (tmpNode.node.getLeftNode() != null) { 
                q.add(new QueueObj(tmpNode.node.getLeftNode(), tmpNode.hd - 1)); 
            } 
            if (tmpNode.node.getRightNode() != null) { 
                q.add(new QueueObj(tmpNode.node.getRightNode(), tmpNode.hd + 1)); 
            } 
  
        } 
        for (Entry<Integer, BinaryNode<T>> entry : topViewMap.entrySet()) { 
            System.out.print(entry.getValue().getValue()); 
        } 
    } 
}
