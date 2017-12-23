package com.java.control.statements;

/**
 * 
 * This code is a copyright of Ashraf LLC @2017 India Inc.
 * Some more copyrights lines here
 * @author ashraf
 * 
 * Program to print prime numbers. 
 *
 */
public class HelloMain {
	
	public static void main(String[] args) {

		System.out.println("1\n2");
		for (int i = 3; i <= 100; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i%j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime)
				System.out.println(i);
		}
	}

}
