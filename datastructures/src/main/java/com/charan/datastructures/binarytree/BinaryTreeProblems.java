package com.charan.datastructures.binarytree;

public class BinaryTreeProblems<T extends Comparable> {

	private BinaryTree<T> binaryTree;

	public BinaryTree<T> getBinaryTree() {
		return binaryTree;
	}

	public void setBinaryTree(BinaryTree<T> binaryTree) {
		this.binaryTree = binaryTree;
	}

	public int maxDepth(BinaryNode<T> node)  
    { 
        if (node == null) 
            return 0; 
        else 
        { 
            /* compute the depth of each subtree */
            int lDepth = maxDepth(node.getLeftNode()); 
            int rDepth = maxDepth(node.getRightNode()); 
   
            /* use the larger one */
            if (lDepth > rDepth) 
                return (lDepth + 1); 
             else 
                return (rDepth + 1); 
        } 
    } 
}
