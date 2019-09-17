package com.globant.fit;

/**
 * Class that represents a Binary Tree Node. It has a value, a left node and a right node.
 * @author Andres Ortiz
 *
 */
public class Node {

	/**
	 * Node integer value
	 */
	private int value;
	
	/**
	 * Left Node
	 */
	private Node left;
	
	/**
	 * Right Node
	 */
	private Node right;

	/**
	 * Class Constructor
	 * @param value the integer value of the node
	 */
	public Node (int value) {
		this.value = value;
	}

	/**
	 * Return the integer value of the node
	 * @return the integer value of the node
	 */
	public int getValue() {
		return value;
	}

	/**
	 * Return the left node
	 * @return the left node
	 */
	public Node getLeft() {
		return left;
	}

	/**
	 * Return the right node
	 * @return the right node
	 */
	public Node getRight() {
		return right;
	}

	/**
	 * Set the left node
	 * @param left the left node
	 */
	public void setLeft(Node left) {
		this.left = left;
	}

	/**
	 * Set the right node
	 * @param right right left node
	 */
	public void setRight(Node right) {
		this.right = right;
	}
}
