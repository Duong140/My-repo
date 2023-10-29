package com.FirstTenPrograms;



public class BinarySearchTree {
	
	Node root;
	
	public void addNode(int key, String name) {
		Node newNode = new Node(key, name);
		
		if(root == null) {
			
			root = newNode;
		} else {
			
			Node focusNode = root;
			
			Node parent;
			
			while(true) {
				
				parent = focusNode;
				
				if(key < focusNode.key) {
					
					focusNode = focusNode.left;
					
					if(focusNode == null) {
						
						parent.left = newNode;
						
						return;
					}
				} else {
					
					focusNode = focusNode.right;
					
					if(focusNode == null) {
						
						parent.right = newNode;
						return;
					}
				}
			}
		}
	}
	
	public void inOrderTraverseTree(Node focusNode) {
		
		if(focusNode != null) {
			
			inOrderTraverseTree(focusNode.left);
			
			System.out.println(focusNode);
			
			inOrderTraverseTree(focusNode.right);
		}
	}

	public static void main(String[] args) {
		
		BinarySearchTree theTree = new BinarySearchTree();
		
		theTree.addNode(25, "Mike");
		theTree.addNode(33, "Erin");
		theTree.addNode(55, "Kaiden");
		theTree.addNode(45, "Yen");
		theTree.addNode(53, "Kayla");
		theTree.addNode(50, "Boss");
		
		theTree.inOrderTraverseTree(theTree.root);
		

	}
	
	public class Node  {
		int key;
		String name;
		Node left;
		Node right;
		
	 Node(int key, String name){
		 this.key = key;
		 
		 this.name = name;
	 }
	 
	 public String toString() {
		 return name + " has a key " + key;
		 
	 }
	}

}
