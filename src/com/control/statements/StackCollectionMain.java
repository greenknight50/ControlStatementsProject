import java.util.Stack;

public class StackCollectionMain {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		System.out.println("Is stack empty: " + stack.empty() + ", Stack capacity: " + stack.capacity() + ", size: " + stack.size());
		stack.push("Leavit");
		stack.push("Bell");
		stack.push("Oakley");
		stack.add(1, "Thome");
		stack.add("Rosemont");
		System.out.println("Stack before replacing with set: " + stack);
		stack.set(2, "Highland");
		stack.add("Western");
		stack.add("Artesian");
		stack.add("Maplewood");
		stack.add("Rockwell");
		stack.add("Downtown");
		System.out.println("\nIs stack empty: " + stack.empty() + ", Elements of stack are: " + stack);
		System.out.println("Popped element: " + stack.pop());
		System.out.println("Popped element: " + stack.pop());
		System.out.println("Popped element: " + stack.pop());
		System.out.println("Peeked element: " + stack.peek());
		System.out.println("Peeked element: " + stack.peek());
		System.out.println("Peeked element: " + stack.peek());
		stack.clear();
		//System.out.println("Popped element: " + stack.peek());
		System.out.println("Capacity of stack: " +stack.capacity() +", size of stack: " +stack.size());
		System.out.println("\nIs stack empty: " + stack.empty() + ", Elements of stack are: " + stack);
	}

}
