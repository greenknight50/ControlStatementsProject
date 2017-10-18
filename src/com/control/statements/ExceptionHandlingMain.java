package com.control.statements;

import java.util.Scanner;

public class ExceptionHandlingMain {

	public static void main(String[] args) {
		Scanner scanner;
		scanner = new Scanner(System.in);
		int x, y, z = 0;
		ExceptionHandlingMain obj = new ExceptionHandlingMain();
		System.out.println("Inside Main method");
		try {
			Class cls = Class.forName("com.control.statements.ExceptionHandlingMain");
			ExceptionHandlingMain obj1 = (ExceptionHandlingMain) cls.newInstance();
			System.out.println("obj1: " + obj1);
			System.out.println("Please enter x value: ");
			x = scanner.nextInt();
			System.out.println("Please enter y value: ");
			y = scanner.nextInt();
			z = x / y;
			
		} catch (ClassNotFoundException | ArithmeticException ex) {
			System.out.println("Common catch block");
			z = 35;
			System.out.println("Class exception: " + ex.getMessage());
		} catch (Exception e) {
			z = 20;
			e.printStackTrace();
		} finally {
			scanner.close();
			System.out.println("This will be executed all time unless system crashes");
		}
		System.out.println("Z value: " + z);

	}

}
