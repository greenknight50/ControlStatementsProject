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
			boolean flag = false;
			if(i%3==0) {
				flag = true;
				System.out.print("Fizz");
			}
			if(i%5==0) {
				flag = true;
				System.out.print("Buzz");
			}
			if(!flag) {
				System.out.print(i);
			}
			System.out.println("");
		}
	}

}
