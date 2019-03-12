package com.charan.datastructures.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BreathFirstTraversalGrapth {

	int vertices;
	LinkedList<Integer>[] listArray;

	BreathFirstTraversalGrapth(int vertexCount) {
		listArray = new LinkedList[vertexCount];
		for (int i = 0; i < vertexCount; i++) {
			listArray[i] = new LinkedList<Integer>();
		}
	}

	public void addEdge(Integer vertex, Integer destination) {
		listArray[vertex].add(destination);
	}

	public void traverse(boolean[] visitedArray,List<Integer> integerList) {
		int vertex;
		if(integerList.size() > 0) {
		vertex = integerList.get(0);
		integerList.remove(0);
		} else
			return;
		
		System.out.println("visited vertex : " + vertex);
		LinkedList<Integer> values = listArray[vertex];
		
		while (values.size() > 0) {
			Integer value = values.pop();
			if (!visitedArray[value]) {
				integerList.add(value);
				visitedArray[value] = true;
			}
		}
		if(integerList.size() > 0) {
			traverse(visitedArray, integerList);
		}
	}

	public void breadthFirst(Integer vertex) {
		boolean[] visitedArray = new boolean[listArray.length];
		List<Integer> integerList = new ArrayList<Integer>();
		integerList.add(vertex);
		traverse(visitedArray,integerList);
	}

	public static void main(String[] args) {
		BreathFirstTraversalGrapth g = new BreathFirstTraversalGrapth(5);
		// g.input1();
		g.input2();
		g.breadthFirst(0);
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
