package com.Level1TenPrograms;

public class StackLinkedList {

	public static void main(String[] args) {
		StackLinkedList SLL = new StackLinkedList();
		
		
		SLL.push(10);
		SLL.push(20);
		SLL.push(30);
		SLL.push(40);
		SLL.push(50);
		System.out.println("Element removed or popped from stack " + SLL.pop());
		System.out.println("Element removed or popped from stack " + SLL.pop());
		System.out.println("Element removed or popped from stack " + SLL.pop());

	}
	
	
	Node head;
	
	 class Node {
		int value;
		Node next;
		
	}
	 
	 StackLinkedList(){
		 head = null;
		 
	 }
	 
	 public void push(int value) {
		 Node extraHead = head;
		 head = new Node();
		 head.value = value;
		 head.next = extraHead;
	 }
	 
	 public int pop() {
		 if(head == null) {
			 System.out.println("stack is empty");
			} 
		 	 int value = head.value;
			 head = head.next;
			 return value;
		 
		 
		 
	 }
	 
	 

}
