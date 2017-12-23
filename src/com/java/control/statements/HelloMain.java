package com.java.control.statements;

/**
 * 
 * This code is a copyright of Ashraf LLC @2017 India Inc.
 * Some more copyrights lines here
 * @author ashraf
 * 
 * Print number from 1 t0 50. For numbers divisible by 3 print "Fizz", for numbers divisible by 5 print "Buzz"
 * and for numbers divisible by both 3 and 5 print "FizzBuzz".
 *
 */
public class HelloMain {
	
	public static void main(String[] args) {
		
		for (int i = 1; i <= 50; i++) {
			if(i%3==0 && i%5==0) {
				System.out.println("FizzBuzz");
			} else if(i%3==0) {
				System.out.println("Fizz");
			} else if (i%5==0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
	}

}
