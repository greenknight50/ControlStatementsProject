package com.control.statements;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


class DemoException {
	
	void displaySomething() throws IOException {
		System.out.println(5/0);
	}
}

public class ExceptionHandlingMain extends DemoException {

	public static void main(String[] args) {}
	
	@Override
	void displaySomething() throws FileNotFoundException {
		
	}

}
