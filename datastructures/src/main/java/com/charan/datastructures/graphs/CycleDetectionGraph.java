package com.charan.datastructures.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CycleDetectionGraph {

	int vertices;
	LinkedList<Integer>[] listArray;

	CycleDetectionGraph(int vertexCount) {
		vertices = vertexCount;
		listArray = new LinkedList[vertexCount];
		for (int i = 0; i < vertexCount; i++) {
			listArray[i] = new LinkedList<Integer>();
		}
	}

	public void addEdge(Integer vertex, Integer destination) {
		listArray[vertex].add(destination);
	}

	public static void main(String[] args) {
		CycleDetectionGraph g = new CycleDetectionGraph(4);
		g.input1();
		 //g.input2();
		System.out.println(g.isCyclic());
	}

	private boolean isCyclic() {
		for (int i = 0; i < vertices; i++) {
			boolean[] visited = new boolean[vertices];
			List<Integer>  integerList = new ArrayList<Integer>();
			if (isCyclic(i, visited,integerList)) {
				System.out.println("visited list");
				System.out.println(integerList);
				return true;
			}
		}
		return false;
	}

	private boolean isCyclic(int i, boolean[] visited) {
		System.out.println("visited " + i);
		visited[i] = true;
		while (listArray[i].size() > 0) {
			int vertex = listArray[i].pop();
			if (visited[vertex]) {
				return true;
			} else {
				isCyclic(vertex, visited);
			}
		}
		return false;
	}
	
	private boolean isCyclic(int vertex, boolean[] visited,List<Integer> integerList) {
		System.out.println("visited " + vertex);
		integerList.add(vertex);
		visited[vertex] = true;
		while (listArray[vertex].size() > 0) {
			int currentVertex = listArray[vertex].pop();
			if (visited[currentVertex]) {
				return true;
			} else {
				isCyclic(currentVertex, visited,integerList);
			}
		}
		return false;
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
