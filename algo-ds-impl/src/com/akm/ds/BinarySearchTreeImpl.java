package com.akm.ds;

public class BinarySearchTreeImpl {
	public static void main(String[] args) {
		BST bst = new BST();

		// Inserting nodes to the BinarySearchTree
		bst.insert(15);
		bst.insert(12);
		bst.insert(10);
		bst.insert(14);
		bst.insert(20);
		bst.insert(18);
		bst.insert(25);

		bst.preorder();
		System.out.println();
		bst.inorder();
		System.out.println();
		bst.postorder();
	}
}

class BST {
	public Node root;

	BST() {
		this.root = null;
	}

	class Node {
		public Node left;
		public Node right;
		public int data;

		Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}

	}

	public void insert(int data) {
		this.root = insert(root, data);
	}

	public int search(int data) {
		return search(root, data);

	}

	public int search(Node node, int data) {
		if (data == node.data)
			return data;

		if (data < node.data)
			return search(node.left, data);
		else
			return search(node.right, data);
	}

	private Node insert(Node node, int data) {
		// Base Case: root is null or not
		if (node == null) {
			// Insert the new data, if root is null.
			node = new Node(data);
			// return the current root to his sub tree
			return node;
		}
		// Here checking for root data is greater or equal to newData or not
		else if (node.data >= data) {
			// if current root data is greater than the new data then now process the left
			// sub-tree
			node.left = insert(node.left, data);
		} else {
			// if current root data is less than the new data then now process the right
			// sub-tree
			node.right = insert(node.right, data);
		}
		return node;
	}

	/**
	 * What is Tree Traversal? All trees can be traversed in three main ways. Each
	 * particular approach gives us a different arrangement of nodes. The three main
	 * approaches used are:-
	 * 
	 * 1) Preorder - This traversal involves printing the root, then recursively
	 * calling the function for the left subtree and the right subtree.
	 * 
	 * 2) Postorder - This traversal involves recursively calling the function for
	 * the left subtree and the right subtree and then printing the root.
	 * 
	 * 3) Inorder - This traversal involves recursively calling the function for the
	 * left subtree, printing the root, and then recursively calling the function
	 * for the right subtree.
	 * 
	 */
	// Traversal
	public void preorder() {
		preorder(root);
	}

	private void preorder(Node node) {
		if (node == null)
			return;
		System.out.print(node.data + " ");
		preorder(node.left);
		preorder(node.right);
	}

	// Traversal
	public void inorder() {
		inorder(root);
	}

	private void inorder(Node node) {
		if (node == null)
			return;
		inorder(node.left);
		System.out.print(node.data + " ");
		inorder(node.right);
	}

	// Traversal
	public void postorder() {
		postorder(root);
	}

	private void postorder(Node node) {
		if (node == null)
			return;
		postorder(node.left);
		postorder(node.right);
		System.out.print(node.data + " ");
	}

}
