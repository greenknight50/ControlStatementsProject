package com.control.statements;

public class IfControlMain {

	public static void main(String[] args) {

		System.out.println("Inside main");
		int a = 5, b = 10, c = 15;
		if (c < a + b) {
			// get user registered
			System.out.println("C is less than a +b");
		} else if (c > a + b) {
			System.out.println("C is greater than a + b");
		} else {
			System.out.println("C is equal to a+b");
		}
		// System.out.println("C: " + c);
		System.out.println("Outside if");
	}

}
