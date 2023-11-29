package com.Level1TenPrograms;

public class DoublyLinked {
	
	public static void main(String[] args) {
	DoublyLinked dll = new DoublyLinked();
	dll.addFirst(1);
	dll.addFirst(100);
	dll.addLast(20);
	dll.addLast(30);
	dll.printList();
	}
	
	private DLLNode header;
	private DLLNode trailer;
	private int size;
	
	public DoublyLinked() {
		header = new DLLNode(null, null, null);
		trailer = new DLLNode(null, header, null);
				header.setNext(trailer);
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public Integer first() {
		if(isEmpty()) {
			return null;
		}
		return header.getNext().getValue();
		
	}
	
	public Integer last() {
		if(isEmpty()) {
			return null;
		}
		
		return trailer.getPrev().getValue();
	}
	
	public void addFirst(Integer value) {
		addBetween(value, header, header.getNext());
		
	}
	
	public void addLast(Integer value) {
		addBetween(value, trailer.getPrev(), trailer);
	}
	
	private void addBetween(Integer value, DLLNode predecessor, DLLNode Successor) {
		DLLNode newest = new DLLNode(value, predecessor, Successor);
		predecessor.setNext(newest);
		Successor.setPrev(newest);
		size++;
	}
	public Integer removeFirst() {
		if(isEmpty()) {
			return null;
		}
		return remove(header.getNext());
	}
	
	public Integer removeLast() {
		if(isEmpty()) {
			return null;
		}
		
		return remove(trailer.getPrev());
		
	}
	
	private Integer remove(DLLNode node) {
		DLLNode predecessor = node.getPrev();
		DLLNode Successor = node.getNext();
		
		predecessor.setNext(Successor);
		Successor.setPrev(predecessor);
		size--;
		
	
		return node.getValue();
		}
	
	public void printList() {
		if(isEmpty()) {
			System.out.println("List is empty!");
		} else {
			System.out.print("Traversing the list: ");
			
			DLLNode start = header.getNext();	
			
			while(start != trailer){
				System.out.print(start.getValue());
				
				
			start = start.getNext();
			
				
			}
			
			
		}
		System.out.println("\nThis size of the list: " + size);
	}



}
