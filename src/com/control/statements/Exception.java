class Exception {
  public static void main(String[] args) {
 
  int a, b, result;
 
  java.util.Scanner input = new java.util.Scanner(System.in);
  System.out.println("Input two integers");
 
  a = input.nextInt();
  b = input.nextInt();

  try {
    result  = a / b;
    System.out.println("Result = " + result);
  }
 
  catch (ArithmeticException e) {
    System.out.println("Exception caught: Division by zero.");
  }
  }
}