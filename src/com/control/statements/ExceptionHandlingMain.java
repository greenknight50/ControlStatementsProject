package com.control.statements;

import java.util.Scanner;

class DemoException extends Exception {

	public DemoException() {
		super();
	}

	public DemoException(String message) {
		super(message);
	}

	public DemoException(String message, Throwable cause) {
		super(message, cause);
	}

}

public class ExceptionHandlingMain {

	public static void main(String[] args) {

		try {
			int x, y, z = 0;
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please enter x value: ");
			x = scanner.nextInt();
			System.out.println("Please enter y value: ");
			y = scanner.nextInt();
			if (x == y) {
				throw new DemoException();
			} else if (x < y) {
				throw new DemoException(x + " is less than " + y + ". Be careful");
			}
			z = x / y;
		} catch (DemoException ex) {
			System.out.println("Message is: " + ex.getMessage());
			ex.printStackTrace();
		} catch (ArithmeticException ex) {
			System.out.println("Message is: " + ex.getMessage());
			ex.printStackTrace();
		}

	}

}
