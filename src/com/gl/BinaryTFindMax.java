package com.gl;

public class BinaryTFindMax {

	Node root;

	public static void main(String[] args) {
		BinaryTFindMax bt = new BinaryTFindMax();
		Node root = new Node(10);
		root.addLeft(5, root);
		root.addLeft(15, root.left);
		root.addRight(6, root);
		root.addRight(4, root.right);
		root.addLeft(9, root);
		root.addLeft(11, root.right);
		root.addRight(3, root.left);
		root.addRight(7, root.right);
		root.addLeft(8, root.left);
		root.addRight(13, root.left);
		root.addLeft(12, root.right);
		
		bt.traverse(root);
		
		System.out.println("Max is : "+bt.findMax(root,0));

	}

	public void traverse(Node root) {		
		if(root != null) {
			if(root.left != null) {
				traverse(root.left);
			}
			System.out.println(root.data);
			if(root.right != null) {
				traverse(root.right);
			}
		}
		
	}
	
	public int findMax(Node root, int max) {
		
		while(root != null) {
			if(max < root.data) {
				max = root.data;
			}
			if(root.left != null) {
				return findMax(root.left, max);
			}
			if(root.right != null) {
				return findMax(root.right, max);
			}
			
			return max;
		}
		
		System.out.println("Max is : "+ max);
		return max;
	}
}

class Node {

	int data;
	Node left;
	Node right;

	public Node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}

	public Node addLeft(int data, Node root) {
		while (root.left != null) {
			return addLeft(data, root.left);
		}
		Node left = new Node(data);
		root.left = left;
		return root;
	}

	public Node addRight(int data, Node root) {

		while (root.right != null) {
			return addRight(data, root.right);
		}
		Node right = new Node(data);
		root.right = right;
		return root;
	}

}
