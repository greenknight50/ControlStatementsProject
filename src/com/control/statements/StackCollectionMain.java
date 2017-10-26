package com.control.statements;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class StackCollectionMain {

	public static void main(String[] args) {

		Vector<Integer> vector = new Vector<Integer>(20);
		int capacity = vector.capacity();
		System.out.println("Vector capacity: " + capacity);
		for (int i = 0; i < capacity + 1; i++) {
			vector.addElement(i);
		}
		capacity = vector.capacity();
		System.out.println("Vector length: "+ vector.size() + ", Vector capacity after adding element: " + capacity);
		
		for (int i = vector.size(); i < capacity + 1; i++) {
			vector.addElement(i);
		}
		capacity = vector.capacity();
		System.out.println("Vector length: "+ vector.size() + ", Vector capacity after adding element again: " + capacity);
		
		//using for-each loop
		System.out.println("Iterating vector using for-each loop");
		for (int i : vector) {
			System.out.print(i + " ");
		}
		//using regular for loop
		System.out.println("\nIterating vector using for loop");
		int vectorLength = vector.size();
		for (int i = 0; i < vectorLength; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nIterating using iterator");
		Iterator iterator = vector.iterator();
		while (iterator.hasNext()) {
			int temp = (int) iterator.next();
			System.out.print(temp + " ");
			/*if (temp == 20) {
				vector.add(21, 105);
			}*/
		}
		
		System.out.println("\nIterating using list iterator");
		ListIterator listIterator = vector.listIterator();
		while(listIterator.hasNext()) {
			System.out.print(listIterator.next() + " ");
		}
		
		System.out.println("\nIterating using list iterator previous");
		while(listIterator.hasPrevious()) {
			System.out.print(listIterator.previous() + " ");
		}
	}

}
