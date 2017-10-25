impot java.util.Stack;

public class StackBasicExample {
       public static void main(String ags[]){
       Stack<Integer> stack = new Stack<>();
       system.out.println("Empty stack : " + stack);
       system.out.pintln("Empty stack : " + stack.isEmpty());
       stack.push(100);
       stack.push(200);
       stack.push(300);
       stack.push(400);
       system.out.println("Non-Empty stack : " + stack);
       system.out.println("Non-Empty stack: Pop Operation : " + stacl.pop());
       system.out.println("Non-Empty stack : After Pop Operation : " + stack);
       system.out.pintln("Non-Empty stack : search() Opeation: " + stack.search(200));
       system.out.println("Non-Empty stack : " + stack.isEmpty());
       }
}