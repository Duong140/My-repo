package com.Level1TenPrograms;


import java.util.Stack;

public class QueueWithTwoStacks {

	public static void main(String[] args) {
		
	}
	

	public static class MyQueue<T>{
		private Stack<T> stackNewestOnTop = new Stack<T>();
		private Stack<T> stackOldestOnTop = new Stack<T>();
		
		public void enqueue(T value) {
			stackNewestOnTop.push(value);
		}
		
		public T Peek() {
			shiftStacks();
			return stackOldestOnTop.peek();
		}
		
		private void shiftStacks() {
			if(stackOldestOnTop.isEmpty()) {
				while(!stackNewestOnTop.isEmpty()) {
					stackOldestOnTop.push(stackNewestOnTop.pop());
				}
			}
		}
		
		public T dequeue() {
			shiftStacks();
			return stackOldestOnTop.pop();
		}
		
		
	}

}
