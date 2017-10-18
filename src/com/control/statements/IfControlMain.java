package com.control.statements;

public class IfControlMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ExceptionHandlingMain obj = new ExceptionHandlingMain();
	
		
		String helloWorldString = new String("Hello World!");
		String str3 = new String("Hello World!");
		//str = "Hello World!";
		
		String str1 = "hello World!";
		str1 = "First string program";
		str1 = "asdfa";
		
		System.out.println("str after replacing: " + helloWorldString.replace("Hello", "Good"));
		
		StringBuffer strBuffer = new StringBuffer("Hello string buffer");
		StringBuilder strBuilder = new StringBuilder("Hello string builder");
		System.out.println("strBuffer: " +strBuffer);
		int startIndex = strBuffer.indexOf("b");
		int endIndex = strBuffer.length();
		System.out.println("Index of b: " + startIndex);
		strBuffer.replace(startIndex, endIndex, "replaced buffer");
		//strBuffer.append(" changed");
		System.out.println("strBuffer: " +strBuffer);
		
		String str2 = "Hello World!";
		String ch = "H";
		String ch1 = "H";
		
		
		System.out.println("Above if");
		if (helloWorldString.equalsIgnoreCase(str3)) {
			System.out.println("str is equal to str3");
		} else {
			System.out.println("strings are not equal");
		}
		System.out.println("ASCII value of H: " + (int)'H' + ", ASCII value of h: "+(int)'h');
		System.out.println("ch.compareTo(ch1): " + ch.compareTo(ch1));
		
		System.out.println("str1 == str2 result: " + (str1 == str2));
		System.out.println("str == str1 result: " + (helloWorldString == str1) + ", str.equals(str1) result: " + (helloWorldString.equalsIgnoreCase(str1)));
		System.out.println("str == str3 result: " + (helloWorldString == str3));
		
		
	}
	
//Perm 6MB
	//heap memory
}
