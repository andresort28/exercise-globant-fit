package com.globant.fit;

/**
 * Exercise Globant fit: Suppose we have a binary tree of nodes with numeric
 * values, with nodes in no particular order. We would like to find the maximum
 * difference between any ancestor node in the tree and any of that ancestor's
 * descendant nodes.
 * 
 * @author Andres Ortiz
 * @version 1.0
 * @since 2019-09-17
 */
public class App {
	
	/**
	 * Main execution point
	 * @param args
	 */
	public static void main(String[] args) {

		int option = 1;
		BinaryTree tree = buildBinaryTree(option);
		System.out.println("Option: " + option);
		System.out.println("Inorder: " + printInorder(tree.getRoot()));
		System.out.println("Maximum Difference: " + tree.getMaxDifference());
	}

	/**
	 * Build an specific binary tree. Edge cases included.
	 * @param option option that represents binary tree to be built
	 * @return
	 */
	public static BinaryTree buildBinaryTree(int option) {
		Node root = null;
		switch (option) {
		case 1:
			root = new Node(15);
			root.setLeft(new Node(20));
			root.getLeft().setLeft(new Node(13));
			root.getLeft().getLeft().setLeft(new Node(5));
			root.getLeft().setRight(new Node(10));
			root.setRight(new Node(1));
			root.getRight().setLeft(new Node(7));
			root.getRight().getLeft().setRight(new Node(20));
			root.getRight().setRight(new Node(8));
			//Return: 15
			break;
		case 2:
			root = new Node(1);
			root.setLeft(new Node(2));
			root.setRight(new Node(3));
			root.getRight().setRight(new Node(8));
			//Return: -1
			break;
		case 3:
			root = new Node(1);
			root.setLeft(new Node(2));
			root.getLeft().setLeft(new Node(4));
			root.getLeft().setRight(new Node(5));
			
			root.setRight(new Node(3));
			root.getRight().setLeft(new Node(6));
			root.getRight().setRight(new Node(7));
			//Return: -1
			break;
		case 4:
			root = new Node(10);
			root.setLeft(new Node(8));
			root.getLeft().setLeft(new Node(5));
			root.getLeft().getLeft().setLeft(new Node(1));
			root.getLeft().setRight(new Node(6));
			
			root.setRight(new Node(9));
			root.getRight().setRight(new Node(4));
			//Return: 9
			break;
		case 5:
			root = new Node(10);
			root.setLeft(new Node(-6));
			root.getLeft().setLeft(new Node(-20));
			
			root.setRight(new Node(-12));
			root.getRight().setRight(new Node(-1));
			//Return: 30
			break;
		case 6:
			root = new Node(-1);
			root.setLeft(new Node(-2));
			root.getLeft().setLeft(new Node(-4));
			root.getLeft().setRight(new Node(-5));
			
			root.setRight(new Node(-3));
			root.getRight().setLeft(new Node(-6));
			root.getRight().setRight(new Node(-7));
			//Return: 6
			break;
		case 7:
			root = new Node(0);
			root.setLeft(new Node(-10));
			root.setRight(new Node(-20));
			//Return: 20
			break;
		case 8:
			root = new Node(1);
			//Return: -2147483648 (Integer.MIN_VALUE)
			break;
		case 9:
			root = new Node(-1);
			//Return: -2147483648 (Integer.MIN_VALUE)
			break;
		case 10:
			root = null;
			//Return: -2147483648 (Integer.MIN_VALUE)
			break;
		}
		return new BinaryTree(root);
	}

	/**
	 * Return a string that represent an inorder traversal of a binary tree 
	 * @param root root node of a binary tree
	 * @return a string that represent an inorder traversal
	 */
	public static String printInorder(Node root) {
		StringBuilder order = new StringBuilder();
		if (root != null) {
			order.append(printInorder(root.getLeft()));
			order.append(root.getValue() + " ");
			order.append(printInorder(root.getRight()));
		}
		return order.toString();
	}
}
