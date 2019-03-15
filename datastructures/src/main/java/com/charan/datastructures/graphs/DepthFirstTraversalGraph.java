package com.charan.datastructures.graphs;

import java.util.LinkedList;

public class DepthFirstTraversalGraph {

	int vertices;
	LinkedList<Integer>[] listArray;

	DepthFirstTraversalGraph(int vertexCount) {
		listArray = new LinkedList[vertexCount];
		for (int i = 0; i < vertexCount; i++) {
			listArray[i] = new LinkedList<Integer>();
		}
	}

	public void addEdge(Integer vertex, Integer destination) {
		listArray[vertex].add(destination);
	}

	public void traverse(Integer vertex, boolean[] visitedArray) {
		System.out.println("visited vertex : " + vertex);
		visitedArray[vertex] = true;
		LinkedList<Integer> values = listArray[vertex];
		while (values.size() > 0) {
			Integer value = values.pop();
			if (!visitedArray[value]) {
				traverse(value, visitedArray);
			}
		}
	}

	public void depthFirst(Integer vertex) {
		boolean[] visitedArray = new boolean[listArray.length];
		traverse(vertex, visitedArray);
	}

	public static void main(String[] args) {
		DepthFirstTraversalGraph g = new DepthFirstTraversalGraph(5);
		//g.input1();
		g.input2();
		g.depthFirst(0);
	}

	public void input1() {
		this.addEdge(0, 1);
		this.addEdge(0, 2);
		this.addEdge(1, 2);
		this.addEdge(2, 0);
		this.addEdge(2, 3);
		this.addEdge(3, 3);
	}

	public void input2() {
		this.addEdge(0, 1);
		this.addEdge(0, 2);
		this.addEdge(0, 3);
		this.addEdge(1, 4);
		this.addEdge(2, 4);
		this.addEdge(3, 4);
	}

}
