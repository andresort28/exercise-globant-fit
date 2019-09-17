package com.globant.fit;

/**
 * Class that represent a binary tree
 * @author Andres Ortiz
 *
 */
public class BinaryTree {
	
	/**
	 * The variable that keep track the maximum difference between any ancestor node in the tree and any of that ancestor's descendant nodes.
	 */
	private int maxDifference;
	
	/**
	 * The root node of the binary tree
	 */
	private Node root;
	
	/**
	 * Class Constructor
	 * @param root the root node of the binary tree
	 */
	public BinaryTree (Node root) {
		this.root = root;
		this.maxDifference = Integer.MIN_VALUE;
	}

	/**
	 * Return the root node of the binary tree
	 * @return the root node of the binary tree
	 */
	public Node getRoot() {
		return root;
	}

	/**
	 * Set the root node
	 * @param root the root node of a binary tree
	 */
	public void setRoot (Node root) {
		this.root = root;
	}
	
	/**
	 * Return the maximum difference between any ancestor node in the tree and any of that ancestor's descendant nodes.
	 * @return the maximum difference between any ancestor node in the tree and any of that ancestor's descendant nodes.
	 */
	public int getMaxDifference () {
		
		getMinValueAndProcessMaxDifference(this.root);
		return maxDifference;
	}
	
	/**
	 * Return the minimum integer value of the binary tree between its left node, its right node and its own value. 
	 * This method keeps track of the maximum difference between any ancestor node in the tree and any of that ancestor's descendant nodes.
	 * @param node a binary tree node
	 * @return The minimum integer value between its own value and it's descendant nodes' values
	 */
	public int getMinValueAndProcessMaxDifference (Node node) {
		
		if(node == null)
			return Integer.MAX_VALUE;
		
		if(node.getRight() == null && node.getLeft() == null)
			return node.getValue();
		
		int minValue = Math.min(getMinValueAndProcessMaxDifference(node.getLeft()), getMinValueAndProcessMaxDifference(node.getRight()));
		int diff = node.getValue() - minValue;
		if(diff > maxDifference)
			maxDifference = diff;
		return Math.min(minValue, node.getValue());
	}
}
