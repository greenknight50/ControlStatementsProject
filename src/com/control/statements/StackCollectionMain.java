package com.control.statements;

import java.util.Stack;

public class StackCollectionMain {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		System.out.println("Is stack empty: " + stack.empty() + ", Stack capacity: " + stack.capacity() + ", size: " + stack.size());
		stack.push(83);
		stack.push(29);
		stack.push(30);
		stack.add(1, 54);
		stack.add(63);
		System.out.println("Stack before replacing with set: " + stack);
		stack.set(2, 19);
		stack.setElementAt(67, 0);
		stack.insertElementAt(105, 5);
		stack.add(34);
		stack.add(23);
		stack.add(53);
		stack.add(36);
		stack.add(89);
		System.out.println("\nIs stack empty: " + stack.empty() + ", Elements of stack are: " + stack);
		System.out.println("Popped element: " + stack.pop());
		System.out.println("Popped element: " + stack.pop());
		System.out.println("Popped element: " + stack.pop());
		System.out.println("Peeked element: " + stack.peek());
		System.out.println("Peeked element: " + stack.peek());
		System.out.println("Peeked element: " + stack.peek());
		stack.clear();
		//System.out.println("Popped element: " + stack.peek());
		System.out.println("Capacity of stack: " +stack.capacity() +", size of stack: " +stack.size());
		System.out.println("\nIs stack empty: " + stack.empty() + ", Elements of stack are: " + stack);
	}

}
