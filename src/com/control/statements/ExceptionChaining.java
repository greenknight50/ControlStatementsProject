package com.control.statements;

public class ExceptionChaining {
	public void myMethod1() throws SomeException1 {  //RESTful request mapping
		try {
			System.out.println("Inside myMethod1");
			myMethod2();
		} catch (SomeException2 me) {
			System.out.println("In myMethod1() catch block:");
			System.out.println("The Message is: " + me.getMessage());
			System.out.println("The cause is: " + me.getCause());
			System.out.println();
			throw new SomeException1("The message from myMethod1()", me);
		}
	}

	public void myMethod2() throws SomeException2 { // Service
		try {
			System.out.println("Inside myMethod2");
			myMethod3();
			System.out.println("Resumed execution");
			// code
		} catch (RuntimeException re) // super class of ArithmeticException
		{
			System.out.println("In myMethod2() catch block:");
			System.out.println("The Message is: " + re.getMessage());
			System.out.println("The cause is: " + re.getCause());
			System.out.println();
			throw new SomeException2("The message from myMethod2()", re);
		}
	}

	public void myMethod3() { //backend database
		try {
			System.out.println("Inside myMethod3");
			int a = 10, b = 0, c;
			c = a / b;
		} catch (ArithmeticException ae) {
			System.out.println("In myMethod3() catch block:");
			System.out.println("The Message is: " + ae.getMessage());
			System.out.println("The cause is: " + ae.getCause());
			System.out.println();
			NumberFormatException nfe = new NumberFormatException("The Message from myMethod3()");
			nfe.initCause(ae);
			throw nfe;
		}
	}

	public static void main(String args[]) {  // browser
		try {
			ExceptionChaining obj = new ExceptionChaining();
			obj.myMethod1();
		} catch (SomeException1 me) {
			System.out.println("In the main() catch block:");
			System.out.println("The Message is: " + me.getMessage());
			System.out.println("The cause is: " + me.getCause());
			System.out.println(); // jut to give a blank line
			System.out.println("To print all the messages from the call stack:");
			me.printStackTrace();
		}
	}
}

class SomeException1 extends Exception // user-defined exception classes
{
	public SomeException1(String message, Throwable cause) { // new feature of JDK 1.4
		super(message, cause); // calls super class (Exception) matching constructor
	}
}

class SomeException2 extends Exception {
	public SomeException2(String message, Throwable cause) {
		super(message, cause);
	}
}